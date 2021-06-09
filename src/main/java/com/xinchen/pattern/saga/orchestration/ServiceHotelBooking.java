package com.xinchen.pattern.saga.orchestration;

/**
 *
 */
class ServiceHotelBooking extends Service<String>{

  @Override
  public String getName() {
    return "booking a Hotel";
  }

  @Override
  public ChapterResult<String> rollback(String value) {
    // 模拟回滚时，修改状态为丢弃 crashed
    if (value.equals("crashed_order")) {
      LOGGER.info("The Rollback for a chapter '{}' has been started. "
              + "The data '{}' has been failed.The saga has been crashed.",
          getName(), value);

      return ChapterResult.failure(value);
    }

    return super.rollback(value);
  }
}
