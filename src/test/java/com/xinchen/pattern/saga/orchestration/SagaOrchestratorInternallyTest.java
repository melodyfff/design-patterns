package com.xinchen.pattern.saga.orchestration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.xinchen.pattern.saga.orchestration.Saga.Result;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 *
 */
class SagaOrchestratorInternallyTest {

  private final List<String> records = new ArrayList<>();

  @Test
  void executeTest(){
    SagaOrchestrator sagaOrchestrator = new SagaOrchestrator(newSaga(), serviceDiscovery());

    Result result = sagaOrchestrator.execute(1);
    assertEquals(Result.ROLLBACK, result);
    assertArrayEquals(
        new String[]{"+1", "+2", "+3", "+4", "-4", "-3", "-2", "-1"},
        records.toArray(new String[]{}));
  }

  private ServiceDiscoveryService serviceDiscovery() {
    return new ServiceDiscoveryService()
        .discover(new Service1())
        .discover(new Service2())
        .discover(new Service3())
        // 模拟process 失败返回fail
        .discover(new Service4());
  }

  private Saga newSaga() {
    return Saga
        .create()
        .chapter("1").chapter("2").chapter("3").chapter("4");
  }


  class Service1 extends Service<Integer>{
    @Override
    public String getName() {
      return "1";
    }

    @Override
    public ChapterResult<Integer> process(Integer value) {
      records.add("+1");
      return ChapterResult.success(value);
    }

    @Override
    public ChapterResult<Integer> rollback(Integer value) {
      records.add("-1");
      return ChapterResult.success(value);
    }
  }

  class Service2 extends Service<Integer> {

    @Override
    public String getName() {
      return "2";
    }

    @Override
    public ChapterResult<Integer> process(Integer value) {
      records.add("+2");
      return ChapterResult.success(value);
    }

    @Override
    public ChapterResult<Integer> rollback(Integer value) {
      records.add("-2");
      return ChapterResult.success(value);
    }
  }

  class Service3 extends Service<Integer> {

    @Override
    public String getName() {
      return "3";
    }

    @Override
    public ChapterResult<Integer> process(Integer value) {
      records.add("+3");
      return ChapterResult.success(value);
    }

    @Override
    public ChapterResult<Integer> rollback(Integer value) {
      records.add("-3");
      return ChapterResult.success(value);
    }
  }

  class Service4 extends Service<Integer> {

    @Override
    public String getName() {
      return "4";
    }

    @Override
    public ChapterResult<Integer> process(Integer value) {
      records.add("+4");
      // 模拟执行失败
      return ChapterResult.failure(value);
    }

    @Override
    public ChapterResult<Integer> rollback(Integer value) {
      records.add("-4");
      return ChapterResult.success(value);
    }
  }
}
