package com.xinchen.pattern.saga.choreography;

/**
 * 一个接口，表示外部服务的契约
 * <p/>
 *
 * 在案例中，service需要根据{@link Saga}状态决定自己的行为
 *
 */
interface ChoreographyChapter {

  /**
   * get name service.
   *
   * @return service name.
   */
  String getName();

  /**
   * In that case, every method is responsible to make a decision on what to do then.
   *
   * process and rollback will exec here
   *
   * @param saga incoming saga
   * @return saga result
   */
  Saga execute(Saga saga);

  /**
   * The operation executed in general case.
   *
   * @param saga incoming saga
   * @return result {@link Saga}
   */
  Saga process(Saga saga);

  /**
   * The operation executed in rollback case.
   *
   * @param saga incoming saga
   * @return result {@link Saga}
   */
  Saga rollback(Saga saga);
}
