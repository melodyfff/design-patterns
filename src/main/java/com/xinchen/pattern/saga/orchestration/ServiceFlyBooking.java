package com.xinchen.pattern.saga.orchestration;

/**
 *
 */
class ServiceFlyBooking extends Service<String>{

  @Override
  public String getName() {
    return "booking a Fly";
  }
}
