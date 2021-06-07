package com.xinchen.pattern.saga.choreography;


/**
 *
 */
class HotelBookingService extends Service {

  protected HotelBookingService(ServiceDiscoveryService sd) {
    super(sd);
  }

  @Override
  public String getName() {
    return "booking a Hotel";
  }
}
