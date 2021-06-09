package com.xinchen.pattern.saga.orchestration;

import com.xinchen.pattern.saga.orchestration.Saga.Chapter;
import com.xinchen.pattern.saga.orchestration.Saga.Result;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
class SagaOrchestrator {
  private static final Logger LOGGER = LoggerFactory.getLogger(SagaOrchestrator.class);

  private final Saga saga;
  private final ServiceDiscoveryService sd;
  private final CurrentState state;

  /**
   * Create a new service to orchetrate sagas.
   *
   * @param saga saga to process
   * @param sd service discovery @see {@link ServiceDiscoveryService}
   */
  public SagaOrchestrator(Saga saga, ServiceDiscoveryService sd) {
    this.saga = saga;
    this.sd = sd;
    this.state = new CurrentState();
  }

  public <V> Result execute(V inVal) {
    // 重置當前saga狀態
    state.cleanUp();
    LOGGER.info(" The new saga is about to start");
    Saga.Result result = Saga.Result.FINISHED;

    // storage inVal
    V tempVal = inVal;

    while (true){
      int next = state.current();
      Chapter chapter = saga.get(next);
      Optional<OrchestrationChapter<?>> srvOpt = sd.find(chapter.name);

      if (!srvOpt.isPresent()){
        // forward -> false
        state.directionToBack();
        // index--
        state.back();
        continue;
      }

      OrchestrationChapter<V> srv = (OrchestrationChapter<V>) srvOpt.get();
      // 判断当前saga的状态是不是向前传递
      if (state.isForward){

        ChapterResult<V> processRes = srv.process(tempVal);
        // 当service执行成功后，位移saga里面的index到下一个chapter
        if (processRes.isSuccess()){
          next = state.forward();
          tempVal = processRes.getValue();
        } else {
          // isForward -> false
          state.directionToBack();
        }

      } else {
        // 回滚传入产生
        ChapterResult<V> rollbackRes =  srv.rollback(tempVal);
        // 判断回滚是否成功，
        if (rollbackRes.isSuccess()){
          // 回退到上一个saga  zindex
          next = state.back();
          tempVal = rollbackRes.getValue();
        } else {
          // 抛弃
          result = Saga.Result.CRASHED;
          next = state.back();
        }
      }


      if (!saga.isPresentChapter(next)) {
        return state.isForward() ?  Saga.Result.FINISHED : result == Saga.Result.CRASHED ? Saga.Result.CRASHED : Saga.Result.ROLLBACK;
      }
    }
  }

  /**
   * 存储当前sage的chapter index , 与state
   */
  private static class CurrentState {

    int currentNumber;
    boolean isForward;

    void cleanUp() {
      currentNumber = 0;
      isForward = true;
    }

    CurrentState() {
      this.currentNumber = 0;
      this.isForward = true;
    }


    boolean isForward() {
      return isForward;
    }

    void directionToBack() {
      isForward = false;
    }

    int forward() {
      return ++currentNumber;
    }

    int back() {
      return --currentNumber;
    }

    int current() {
      return currentNumber;
    }
  }
}
