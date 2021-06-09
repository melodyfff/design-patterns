package com.xinchen.pattern.service_locator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
class ServiceCache {
  private static final Logger LOGGER = LoggerFactory.getLogger(ServiceCache.class);

  private final Map<String,Service> serviceCache;

  ServiceCache() {
    serviceCache = new HashMap<>();
  }

  Optional<Service> getService(String serviceName){

    Optional<Service> srvOpt = Optional.ofNullable(serviceCache.get(serviceName));
    if (srvOpt.isPresent()){
      Service service = srvOpt.get();
      LOGGER.info("(cache call) Fetched service {}({}) from cache... !", service.getName(), service.getId());
    }
    return srvOpt;
  }

  void addService(Service service){
    serviceCache.put(service.getName(), service);
  }
}
