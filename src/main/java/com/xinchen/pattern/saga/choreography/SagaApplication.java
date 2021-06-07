package com.xinchen.pattern.saga.choreography;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
class SagaApplication {
  private static final Logger LOGGER = LoggerFactory.getLogger(SagaApplication.class);
  public static void main(String[] args) {
    ServiceDiscoveryService sd = serviceDiscovery();
    ChoreographyChapter service = sd.findAny();

    Saga goodOrder = service.execute(newSaga("good_order"));
    Saga badOrder = service.execute(newSaga("bad_order"));

    LOGGER.error("orders: goodOrder is "+goodOrder.getResult()+", badOrder is "+badOrder.getResult());
  }

  private static Saga newSaga(String value) {
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
        .discover(new WithdrawMoneyService(sd))
        ;
  }
}
