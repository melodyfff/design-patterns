package com.xinchen.pattern.hexagonal.lottery.domain;

import com.google.inject.Inject;
import com.xinchen.pattern.hexagonal.lottery.banking.WireTransfers;
import com.xinchen.pattern.hexagonal.lottery.database.LotteryTicketRepository;
import com.xinchen.pattern.hexagonal.lottery.eventlog.LotteryEventLog;

import java.util.Map;

/**
 * Lottery administration implementation
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 15:33
 */
public class LotteryAdministration {
    private final LotteryTicketRepository repository;
    private final LotteryEventLog notifications;
    private final WireTransfers wireTransfers;

    /**
     * Constructor
     */
    @Inject
    public LotteryAdministration(LotteryTicketRepository repository, LotteryEventLog notifications,
                                 WireTransfers wireTransfers) {
        this.repository = repository;
        this.notifications = notifications;
        this.wireTransfers = wireTransfers;
    }

    /**
     * Get all the lottery tickets submitted for lottery
     */
    public Map<LotteryTicketId, LotteryTicket> getAllSubmittedTickets() {
        return repository.findAll();
    }

    /**
     * Draw lottery numbers
     */
    public LotteryNumbers performLottery() {
        LotteryNumbers numbers = LotteryNumbers.createRandom();
        Map<LotteryTicketId, LotteryTicket> tickets = getAllSubmittedTickets();
        for (LotteryTicketId id : tickets.keySet()) {
            LotteryTicketCheckResult result = LotteryUtils.checkTicketForPrize(repository, id, numbers);
            if (result.getResult().equals(LotteryTicketCheckResult.CheckResult.WIN_PRIZE)) {
                boolean transferred = wireTransfers.transferFunds(LotteryConstants.PRIZE_AMOUNT,
                        LotteryConstants.SERVICE_BANK_ACCOUNT, tickets.get(id).getPlayerDetails().getBankAccount());
                if (transferred) {
                    // win
                    notifications.ticketWon(tickets.get(id).getPlayerDetails(), LotteryConstants.PRIZE_AMOUNT);
                } else {
                    // 支付出错
                    notifications.prizeError(tickets.get(id).getPlayerDetails(), LotteryConstants.PRIZE_AMOUNT);
                }
            } else if (result.getResult().equals(LotteryTicketCheckResult.CheckResult.NO_PRIZE)) {
                notifications.ticketDidNotWin(tickets.get(id).getPlayerDetails());
            }
        }
        return numbers;
    }

    /**
     * Begin new lottery round
     */
    public void resetLottery() {
        repository.deleteAll();
    }
}
