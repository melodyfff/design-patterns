package com.xinchen.pattern.saga.choreography;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * empty test
 */
class SagaApplicationTest {

  @Test
  void shouldExecuteWithoutException(){
    assertDoesNotThrow(()-> SagaApplication.main(new String[]{}));
  }
}