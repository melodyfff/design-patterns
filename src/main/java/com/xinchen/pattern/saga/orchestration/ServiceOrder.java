package com.xinchen.pattern.saga.orchestration;

/**
 *
 */
class ServiceOrder extends Service<String> {

  @Override
  public String getName() {
    return "init an order";
  }
}
