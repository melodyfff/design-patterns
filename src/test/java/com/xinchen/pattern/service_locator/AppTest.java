package com.xinchen.pattern.service_locator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

/**
 *
 */
class AppTest {
  @Test
  void shouldExecuteWithoutException() {
    assertDoesNotThrow(() -> App.main(new String[]{}));
  }
}