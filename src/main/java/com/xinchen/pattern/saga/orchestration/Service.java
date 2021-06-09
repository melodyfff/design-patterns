package com.xinchen.pattern.saga.orchestration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
abstract class Service<V> implements OrchestrationChapter<V>{
  protected static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

  @Override
  public abstract String getName();

  @Override
  public ChapterResult<V> process(V value) {
    LOGGER.info("The chapter '{}' has been started. "
            + "The data '{}' has been stored or calculated successfully",
        getName(), value);
    return ChapterResult.success(value);
  }

  @Override
  public ChapterResult<V> rollback(V value) {
    LOGGER.info("The Rollback for a chapter '{}' has been started. "
            + "The data {} has been rollbacked successfully",
        getName(), value);
    return ChapterResult.success(value);
  }
}
