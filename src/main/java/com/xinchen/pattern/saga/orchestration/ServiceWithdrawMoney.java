package com.xinchen.pattern.saga.orchestration;

/**
 *
 */
class ServiceWithdrawMoney extends Service<String>{

  @Override
  public String getName() {
    return "withdrawing Money";
  }

  @Override
  public ChapterResult<String> process(String value) {
    // 模拟处理失败
    if (value.equals("bad_order") || value.equals("crashed_order")) {
      LOGGER.info("The chapter '{}' has been started. But the exception has been raised."
              + "The rollback is about to start",
          getName());
      return ChapterResult.failure(value);
    }
    return super.process(value);
  }
}
