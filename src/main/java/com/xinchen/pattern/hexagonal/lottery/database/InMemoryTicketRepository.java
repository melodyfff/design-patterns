package com.xinchen.pattern.hexagonal.lottery.database;

import com.xinchen.pattern.hexagonal.lottery.domain.LotteryTicket;
import com.xinchen.pattern.hexagonal.lottery.domain.LotteryTicketId;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Mock database for lottery tickets.
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 17:04
 */
public class InMemoryTicketRepository implements LotteryTicketRepository {
    private static Map<LotteryTicketId, LotteryTicket> tickets = new HashMap<>();

    @Override
    public Optional<LotteryTicket> findById(LotteryTicketId id) {
        LotteryTicket ticket = tickets.get(id);
        if (ticket == null) {
            return Optional.empty();
        } else {
            return Optional.of(ticket);
        }
    }

    @Override
    public Optional<LotteryTicketId> save(LotteryTicket ticket) {
        LotteryTicketId id = new LotteryTicketId();
        tickets.put(id, ticket);
        return Optional.of(id);
    }

    @Override
    public Map<LotteryTicketId, LotteryTicket> findAll() {
        return tickets;
    }

    @Override
    public void deleteAll() {
        tickets.clear();
    }
}
