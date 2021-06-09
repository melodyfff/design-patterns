package com.xinchen.pattern.saga.orchestration;

/**
 *
 * ChoreographyChapter 里面多一个execute()方法，会自己处理 process()和rollback()
 *
 *
 * ChoreographyChapter is an interface representing a contract for an external service.
 *
 * @param <V> is type for passing params
 *
 */
interface OrchestrationChapter<V> {
  /**
   * method get name.
   *
   * @return service name.
   */
  String getName();

  /**
   * The operation executed in general case.
   *
   * @param value incoming value
   * @return result {@link ChapterResult}
   */
  ChapterResult<V> process(V value);

  /**
   * The operation executed in rollback case.
   *
   * @param value incoming value
   * @return result {@link ChapterResult}
   */
  ChapterResult<V> rollback(V value);

}
