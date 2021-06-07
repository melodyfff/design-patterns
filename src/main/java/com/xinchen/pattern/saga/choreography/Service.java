package com.xinchen.pattern.saga.choreography;

import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
abstract class Service implements ChoreographyChapter{
  protected static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

  private final ServiceDiscoveryService sd;

  protected Service(ServiceDiscoveryService sd) {
    this.sd = sd;
  }

  @Override
  public Saga execute(Saga saga) {
    Saga nextSaga = saga;
    Object nextVal;

    // 当前chapter的名字
    String chapterName = saga.getCurrentChapter().getName();

    // 判断Chapter的name与 当前ChoreographyChapter中的服务name是否一致
    if (chapterName.equals(getName())){
      // 判断是否向前传递,不是向前就是back
      // 若是向前则正常执行process，执行完成后判断是否成功，根据结果决定是否回退
      // 若是已经是回退，则执行rollback
      if (saga.isForward()){
        // 真正执行
        nextSaga = process(saga);
        nextVal = nextSaga.getCurrentValue(); // 当前chapter中的income object

        // 判断当前chapter是否执行成功
        if (nextSaga.isCurrentChapterSuccess()){
          // 移动saga中的pos位置到下一个
          nextSaga.forward();
        } else {
          // 回退saga中的pos位置，并设置forward为false
          nextSaga.back();
        }

      } else {
        nextSaga = rollback(saga);
        nextVal = nextSaga.getCurrentValue();

        // 移动saga中的pos位置往前,并设置forward为false
        nextSaga.back();
      }

      // 判断saga中是否已经完全执行完毕
      if (isSagaFinished(nextSaga)){
        return nextSaga;
      }

      nextSaga.setCurrentValue(nextVal);
    }

    Saga finalNextSaga = nextSaga;

    return sd
        // 服务发现
        .find(chapterName)
        .map(ch-> ch.execute(finalNextSaga))
        .orElseThrow(serviceNotFoundException(chapterName))
        ;
  }

  @Override
  public Saga process(Saga saga) {
    Object inVal = saga.getCurrentValue();

    LOGGER.info("The chapter '"+getName()+"' has been started. "
            + "The data '"+inVal+"' has been stored or calculated successfully");

    saga.setCurrentStatus(Saga.ChapterResult.SUCCESS);

    // 这里可以放计算过后的值
    saga.setCurrentValue(inVal);
    return saga;
  }

  @Override
  public Saga rollback(Saga saga) {
    Object inVal = saga.getCurrentValue();
    // 这里其实可以有真正的回滚逻辑操作
    LOGGER.info("The Rollback for a chapter '"+getName()+"' has been started. "
            + "The data '"+inVal+"' has been rollbacked successfully");
    // 设置saga中的chapter状态为rollback
    saga.setCurrentStatus(Saga.ChapterResult.ROLLBACK);
    // 这里可以放回滚后的值
    saga.setCurrentValue(inVal);
    return saga;
  }


  private Supplier<RuntimeException> serviceNotFoundException(String chServiceName) {
    return () -> new RuntimeException(
        String.format("the service %s has not been found", chServiceName));
  }

  private boolean isSagaFinished(Saga saga){
    // 判断list中是否还存在chapter,若是不存在，走服务发现，执行下一个saga
    if (!saga.isPresentChapter()){
      saga.setFinished(true);
      LOGGER.info(" the saga has been finished with "+saga.getResult()+" status");
      return true;
    }
    return false;
  }
}
