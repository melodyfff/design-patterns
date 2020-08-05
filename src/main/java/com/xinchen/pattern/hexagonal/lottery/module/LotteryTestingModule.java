package com.xinchen.pattern.hexagonal.lottery.module;

import com.google.inject.AbstractModule;
import com.xinchen.pattern.hexagonal.lottery.banking.InMemoryBank;
import com.xinchen.pattern.hexagonal.lottery.banking.WireTransfers;
import com.xinchen.pattern.hexagonal.lottery.database.InMemoryTicketRepository;
import com.xinchen.pattern.hexagonal.lottery.database.LotteryTicketRepository;
import com.xinchen.pattern.hexagonal.lottery.eventlog.LotteryEventLog;
import com.xinchen.pattern.hexagonal.lottery.eventlog.StdOutEventLog;

/**
 * Guice module for testing dependencies
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 17:03
 */
public class LotteryTestingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LotteryTicketRepository.class).to(InMemoryTicketRepository.class);
        bind(LotteryEventLog.class).to(StdOutEventLog.class);
        bind(WireTransfers.class).to(InMemoryBank.class);
    }
}
