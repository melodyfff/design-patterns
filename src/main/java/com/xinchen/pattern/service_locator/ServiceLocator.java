package com.xinchen.pattern.service_locator;

import java.util.Optional;

/**
 *
 */
final class ServiceLocator {

  private static final ServiceCache serviceCache = new ServiceCache();

  private static final InitContext context = new InitContext();

  private ServiceLocator() {}

  static Service getService(String serviceName){
    Optional<Service> srvOpt = serviceCache.getService(serviceName);

    if (srvOpt.isPresent()){
      return srvOpt.get();
    } else {
      Service serviceObj = (Service) context.lookUp(serviceName);
      if (null!=serviceObj){
        serviceCache.addService(serviceObj);
      }
      return serviceObj;
    }
  }
}
