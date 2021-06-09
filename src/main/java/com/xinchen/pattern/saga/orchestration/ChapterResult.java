package com.xinchen.pattern.saga.orchestration;

/**
 *
 * Executing result for chapter.
 *
 * @param <V> incoming value
 *
 */
class ChapterResult<V> {

  private final V value;
  private final State state;

  ChapterResult(V value, State state) {
    this.value = value;
    this.state = state;
  }

  public V getValue() {
    return value;
  }

  public boolean isSuccess() {
    return state == State.SUCCESS;
  }

  public static <V> ChapterResult<V> success(V val) {
    return new ChapterResult<>(val, State.SUCCESS);
  }

  public static <V> ChapterResult<V> failure(V val) {
    return new ChapterResult<>(val, State.FAILURE);
  }

  enum State{
    SUCCESS, FAILURE
  }
}
