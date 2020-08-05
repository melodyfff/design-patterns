package com.xinchen.pattern.hexagonal.lottery.domain;

/**
 * Lottery ticked id
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 14:57
 */
public class LotteryTicketId {
    private static volatile int numAllocated;
    private final int id;

    public LotteryTicketId() {
        this.id = numAllocated + 1;
        numAllocated++;
    }

    public LotteryTicketId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%d", id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LotteryTicketId that = (LotteryTicketId) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
