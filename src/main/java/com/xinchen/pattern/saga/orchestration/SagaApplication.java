package com.xinchen.pattern.saga.orchestration;

import com.xinchen.pattern.saga.orchestration.Saga.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
class SagaApplication {

  static final Logger LOGGER = LoggerFactory.getLogger(SagaApplication.class);

  public static void main(String[] args) {
    // 控制所有saga进度
    SagaOrchestrator sagaOrchestrator = new SagaOrchestrator(newSaga(), serviceDiscovery());

    Result goodOrder = sagaOrchestrator.execute("good_order");
    Result badOrder = sagaOrchestrator.execute("bad_order");
    Result crashedOrder = sagaOrchestrator.execute("crashed_order");

    LOGGER.info("orders: goodOrder is {}, badOrder is {},crashedOrder is {}",
        goodOrder, badOrder, crashedOrder);
  }

  private static ServiceDiscoveryService serviceDiscovery() {
    return new ServiceDiscoveryService()
        .discover(new ServiceOrder())
        .discover(new ServiceFlyBooking())
        .discover(new ServiceHotelBooking())
        .discover(new ServiceWithdrawMoney());
  }

  private static Saga newSaga() {
    return Saga
        .create()
        .chapter("init an order")
        .chapter("booking a Fly")
        .chapter("booking a Hotel")
        .chapter("withdrawing Money");
  }
}
