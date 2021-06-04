package com.xinchen.pattern.saga.choreography;

import java.util.ArrayList;
import java.util.List;

/**
 * Saga representation.
 * <p/>
 * Saga consists of chapters.
 * <p/>
 * Every ChoreographyChapter is executed a certain service.
 */
class Saga {
  private final List<Chapter> chapters;
  private int pos;
  private boolean forward;
  private boolean finished;

  Saga() {
    this.chapters = new ArrayList<>();
    this.pos = 0;
    this.forward = true;
    this.finished = false;
  }

  public static Saga create() {
    return new Saga();
  }

  /**
   * add chapter to saga.
   *
   * @param name chapter name
   * @return this
   */
  public Saga chapter(String name) {
    this.chapters.add(new Chapter(name));
    return this;
  }

  /**
   * set value to last chapter.
   *
   * @param value invalue
   * @return this
   */
  public Saga setInValue(Object value) {
    // 没有chapter直接返回，不做处理
    if (chapters.isEmpty()) {
      return this;
    }
    // 将值设置到链表末尾
    chapters.get(chapters.size() - 1).setInValue(value);
    return this;
  }

  /**
   * get value from current chapter.
   *
   * @return value
   */
  public Object getCurrentValue() {
    // 根据pos设置
    return chapters.get(pos).getInValue();
  }

  /**
   * set value to current chapter.
   *
   * @param value to set
   */
  public void setCurrentValue(Object value) {
    chapters.get(pos).setInValue(value);
  }

  /**
   * set status for current chapter.
   *
   * @param result to set
   */
  public void setCurrentStatus(ChapterResult result) {
    chapters.get(pos).setResult(result);
  }

  void setFinished(boolean finished) {
    this.finished = finished;
  }

  boolean isForward() {
    return forward;
  }

  int forward() {
    return ++pos;
  }

  int back() {
    this.forward = false;
    return --pos;
  }

  Chapter getCurrentChapter() {
    return chapters.get(pos);
  }

  boolean isPresentChapter() {
    return pos >= 0 && pos < chapters.size();
  }

  boolean isCurrentChapterSuccess() {
    return chapters.get(pos).isSuccess();
  }

  /**
   * get result of saga.
   *
   * @return result of saga @see {@link SagaResult}
   */
  public SagaResult getResult() {
    // 判断是否完成
    if (finished) {
      return forward
          ? SagaResult.FINISHED
          : SagaResult.ROLLBACKED;
    }
    // 默认返回还在处理中
    return SagaResult.PROGRESS;
  }


  //---------------------------------------------------------------------------------------------
  // Static Class
  //---------------------------------------------------------------------------------------------


  /**
   * Class presents a chapter status and incoming parameters(incoming parameter transforms to
   * outcoming parameter).
   */
  static class Chapter{
    private final String name;
    private ChapterResult result;
    private Object inValue;
    // maybe outValue can exist here

    Chapter(String name) {
      this.name = name;
      // init state
      this.result = ChapterResult.INIT;
    }

    public String getName() {
      return name;
    }

    public Object getInValue() {
      return inValue;
    }

    public void setInValue(Object inValue) {
      this.inValue = inValue;
    }

    public void setResult(ChapterResult result) {
      this.result = result;
    }

    public boolean isSuccess() {
      return result == ChapterResult.SUCCESS;
    }
  }

  /**
   * result for chapter.
   */
  enum ChapterResult{
    INIT, SUCCESS, ROLLBACK
  }

  /**
   * result for saga.
   */
  enum SagaResult {
    PROGRESS, FINISHED, ROLLBACKED
  }

}
