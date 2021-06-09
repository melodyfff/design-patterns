package com.xinchen.pattern.saga.orchestration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.xinchen.pattern.saga.orchestration.Saga.Result;
import org.junit.jupiter.api.Test;

/**
 *
 */
class SagaOrchestratorTest {

  @Test
  void execute(){
    SagaOrchestrator sagaOrchestrator = new SagaOrchestrator(newSaga(), serviceDiscovery());

    Result badOrder = sagaOrchestrator.execute("bad_order");
    Result crashedOrder = sagaOrchestrator.execute("crashed_order");

    assertEquals(Saga.Result.ROLLBACK, badOrder);
    assertEquals(Saga.Result.CRASHED, crashedOrder);
  }

  private static Saga newSaga() {
    return Saga
        .create()
        .chapter("init an order")
        .chapter("booking a Fly")
        .chapter("booking a Hotel")
        .chapter("withdrawing Money");
  }

  private static ServiceDiscoveryService serviceDiscovery() {
    return
        new ServiceDiscoveryService()
            .discover(new ServiceOrder())
            .discover(new ServiceFlyBooking())
            .discover(new ServiceHotelBooking())
            .discover(new ServiceWithdrawMoney());
  }
}
