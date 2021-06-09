package com.xinchen.pattern.service_locator;


/**
 *
 */
class ServiceImpl implements Service {

  private String serviceName;
  private int id;

  public ServiceImpl(String serviceName) {
    this.serviceName = serviceName;
    // Generate a random id to this service object
    this.id = (int) Math.floor(Math.random() * 1000) + 1;
  }

  @Override
  public String getName() {
    return serviceName;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public void execute() {
    LOGGER.info("Service {} is now executing with id {}", getName(), getId());
  }
}
