package com.xinchen.pattern.saga.choreography;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * 服务发现
 */
class ServiceDiscoveryService {

  private final Map<String, ChoreographyChapter> services;

  public ServiceDiscoveryService() {
    this.services = new HashMap<>();
  }

  /**
   *
   * 随机返回一个服务
   *
   * @return any service
   * @throws NoSuchElementException if no elements further
   */
  public ChoreographyChapter findAny() {
    return services.values().iterator().next();
  }

  public Optional<ChoreographyChapter> find(String service) {
    return Optional.ofNullable(services.getOrDefault(service, null));
  }

  public ServiceDiscoveryService discover(ChoreographyChapter chapterService) {
    services.put(chapterService.getName(), chapterService);
    return this;
  }
}
