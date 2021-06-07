package com.xinchen.pattern.saga.choreography;


/**
 *
 */
class FlyBookingService extends Service {

  protected FlyBookingService(ServiceDiscoveryService sd) {
    super(sd);
  }

  @Override
  public String getName() {
    return "booking a Fly";
  }
}
