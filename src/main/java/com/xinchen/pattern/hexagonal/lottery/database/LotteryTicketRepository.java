package com.xinchen.pattern.hexagonal.lottery.database;

import com.xinchen.pattern.hexagonal.lottery.domain.LotteryTicket;
import com.xinchen.pattern.hexagonal.lottery.domain.LotteryTicketId;

import java.util.Map;
import java.util.Optional;

/**
 *
 * Interface for accessing lottery tickets in database.
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 14:56
 */
public interface LotteryTicketRepository {
    /**
     * Find lottery ticket by id
     */
    Optional<LotteryTicket> findById(LotteryTicketId id);

    /**
     * Save lottery ticket
     */
    Optional<LotteryTicketId> save(LotteryTicket ticket);

    /**
     * Get all lottery tickets
     */
    Map<LotteryTicketId, LotteryTicket> findAll();

    /**
     * Delete all lottery tickets
     */
    void deleteAll();
}
