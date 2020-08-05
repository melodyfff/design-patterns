package com.xinchen.pattern.hexagonal.lottery.banking;

/**
 * Interface to bank accounts.
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 15:03
 */
public interface WireTransfers {
    /**
     * 设置账户资金
     * Set amount of funds for bank account
     */
    void setFunds(String bankAccount, int amount);

    /**
     * 获取账户资金
     * Get amount of funds for bank account
     */
    int getFunds(String bankAccount);

    /**
     * 转账
     * Transfer funds from one bank account to another
     */
    boolean transferFunds(int amount, String sourceBackAccount, String destinationBankAccount);

}
