package com.xinchen.pattern.service_locator;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.Lists;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 *
 */
class ServiceLocatorTest {

  @Test
  void testGetNotExistentService(){
    assertNull(ServiceLocator.getService("fantastic/unicorn/service"));
    assertNull(ServiceLocator.getService("another/fantastic/unicorn/service"));
  }

  @Test
  void testServiceCache() {
    List<String> serviceNames = Lists.newArrayList("jndi/serviceA", "jndi/serviceB");

    for (final String serviceName : serviceNames) {
      final Service service = ServiceLocator.getService(serviceName);
      assertNotNull(service);
      assertEquals(serviceName, service.getName());
      assertTrue(service.getId() > 0); // The id is generated randomly, but the minimum value is '1'
      assertSame(service, ServiceLocator.getService(serviceName));
    }

  }
}