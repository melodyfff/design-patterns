package com.xinchen.pattern.service_locator;

/**
 *
 */
class App {
  public static final String JNDI_SERVICE_A = "jndi/serviceA";
  public static final String JNDI_SERVICE_B = "jndi/serviceB";

  public static void main(String[] args) {
    Service service = ServiceLocator.getService(JNDI_SERVICE_A);
    service.execute();
    service = ServiceLocator.getService(JNDI_SERVICE_B);
    service.execute();
    service = ServiceLocator.getService(JNDI_SERVICE_A);
    service.execute();
    service = ServiceLocator.getService(JNDI_SERVICE_A);
    service.execute();
  }
}
