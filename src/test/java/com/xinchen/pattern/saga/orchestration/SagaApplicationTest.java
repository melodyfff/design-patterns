package com.xinchen.pattern.saga.orchestration;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

/**
 *
 */
class SagaApplicationTest {
  @Test
  void mainTest(){
    assertDoesNotThrow(() -> SagaApplication.main(new String[]{}));
  }
}