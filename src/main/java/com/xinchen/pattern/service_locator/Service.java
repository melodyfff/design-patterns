package com.xinchen.pattern.service_locator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
interface Service {
  Logger LOGGER = LoggerFactory.getLogger(Service.class);

  String getName();

  int getId();

  void execute();
}
