package com.xinchen.pattern.hexagonal.lottery.eventlog;

import com.xinchen.pattern.hexagonal.lottery.domain.PlayerDetails;

/**
 *
 * Event log for lottery events
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 15:01
 */
public interface LotteryEventLog {
    /**
     * lottery ticket submitted
     */
    void ticketSubmitted(PlayerDetails details);

    /**
     * error submitting lottery ticket
     */
    void ticketSubmitError(PlayerDetails details);

    /**
     * lottery ticket did not win
     */
    void ticketDidNotWin(PlayerDetails details);

    /**
     * lottery ticket won
     */
    void ticketWon(PlayerDetails details, int prizeAmount);

    /**
     * error paying the prize
     */
    void prizeError(PlayerDetails details, int prizeAmount);
}
