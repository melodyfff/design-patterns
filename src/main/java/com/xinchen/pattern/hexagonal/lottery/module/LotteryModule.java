package com.xinchen.pattern.hexagonal.lottery.module;

import com.google.inject.AbstractModule;
import com.xinchen.pattern.hexagonal.lottery.banking.MongoBank;
import com.xinchen.pattern.hexagonal.lottery.banking.WireTransfers;
import com.xinchen.pattern.hexagonal.lottery.database.LotteryTicketRepository;
import com.xinchen.pattern.hexagonal.lottery.database.MongoTicketRepository;
import com.xinchen.pattern.hexagonal.lottery.eventlog.LotteryEventLog;
import com.xinchen.pattern.hexagonal.lottery.eventlog.MongoEventLog;

/**
 * Guice module for binding production dependencies
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 17:10
 */
public class LotteryModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LotteryTicketRepository.class).to(MongoTicketRepository.class);
        bind(LotteryEventLog.class).to(MongoEventLog.class);
        bind(WireTransfers.class).to(MongoBank.class);
    }
}
