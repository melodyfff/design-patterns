package com.xinchen.pattern.saga.choreography;

/**
 * OrderService
 */
class OrderService extends Service {

  protected OrderService(ServiceDiscoveryService sd) {
    super(sd);
  }

  @Override
  public String getName() {
    return "init an order";
  }
}
