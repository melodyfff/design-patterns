package com.xinchen.pattern.saga.choreography;


/**
 *
 */
class WithdrawMoneyService extends Service{

  protected WithdrawMoneyService(ServiceDiscoveryService sd) {
    super(sd);
  }

  @Override
  public String getName() {
    return "withdrawing Money";
  }

  @Override
  public Saga process(Saga saga) {
    Object inVal = saga.getCurrentValue();

    // 模拟回滚
    if ("bad_order".equals(inVal)){
      LOGGER.info(
          "The chapter '" + getName() + "' has been started. But the exception has been raised."
              + "The rollback is about to start");
      saga.setCurrentStatus(Saga.ChapterResult.ROLLBACK);
      return saga;
    }

    return super.process(saga);
  }
}
