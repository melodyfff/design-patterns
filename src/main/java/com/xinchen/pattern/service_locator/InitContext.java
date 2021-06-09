package com.xinchen.pattern.service_locator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
class InitContext {
  private static final Logger LOGGER = LoggerFactory.getLogger(InitContext.class);

  Object lookUp(String serviceName){
    // mock lookup
    // 这里实际上可以使用SPI去搜索
    if (serviceName.equals("jndi/serviceA")) {
      LOGGER.info("Looking up service A and creating new service for A");
      return new ServiceImpl("jndi/serviceA");
    } else if (serviceName.equals("jndi/serviceB")) {
      LOGGER.info("Looking up service B and creating new service for B");
      return new ServiceImpl("jndi/serviceB");
    } else {
      return null;
    }
  }

}
