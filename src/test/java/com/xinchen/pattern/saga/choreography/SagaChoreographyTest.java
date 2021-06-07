package com.xinchen.pattern.saga.choreography;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * test to check choreography saga
 */
class SagaChoreographyTest {


  @Test
  void executeTest() {
    ServiceDiscoveryService sd = serviceDiscovery();
    ChoreographyChapter service = sd.findAny();
    Saga badOrderSaga = service.execute(newSaga("bad_order"));
    Saga goodOrderSaga = service.execute(newSaga("good_order"));

    assertEquals(Saga.SagaResult.ROLLBACKED, badOrderSaga.getResult());
    assertEquals(Saga.SagaResult.FINISHED, goodOrderSaga.getResult());
  }

  private static Saga newSaga(Object value) {
    return Saga
        .create()
        .chapter("init an order").setInValue(value)
        .chapter("booking a Fly")
        .chapter("booking a Hotel")
        .chapter("withdrawing Money");
  }

  private static ServiceDiscoveryService serviceDiscovery() {
    ServiceDiscoveryService sd = new ServiceDiscoveryService();
    return sd
        .discover(new OrderService(sd))
        .discover(new FlyBookingService(sd))
        .discover(new HotelBookingService(sd))
        .discover(new WithdrawMoneyService(sd));
  }
}
