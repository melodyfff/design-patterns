package com.xinchen.pattern.saga.orchestration;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 */
class ServiceDiscoveryService {
  private final Map<String, OrchestrationChapter<?>> services;

  ServiceDiscoveryService() {
    this.services = new HashMap<>();
  }

  public Optional<OrchestrationChapter<?>> find(String service) {
    return Optional.ofNullable(services.getOrDefault(service, null));
  }

  public ServiceDiscoveryService discover(OrchestrationChapter<?> orchestrationChapterService) {
    services.put(orchestrationChapterService.getName(), orchestrationChapterService);
    return this;
  }
}
