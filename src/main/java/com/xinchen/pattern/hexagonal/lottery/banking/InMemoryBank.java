package com.xinchen.pattern.hexagonal.lottery.banking;

import com.xinchen.pattern.hexagonal.lottery.domain.LotteryConstants;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Banking implementation
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 15:48
 */
public class InMemoryBank implements WireTransfers{
    private static Map<String, Integer> accounts = new HashMap<>();

    static {
        // 初始化庄家账户，与启动资金
        accounts.put(LotteryConstants.SERVICE_BANK_ACCOUNT, LotteryConstants.SERVICE_BANK_ACCOUNT_SALDO);
    }

    @Override
    public void setFunds(String bankAccount, int amount) {
        accounts.put(bankAccount, amount);
    }

    @Override
    public int getFunds(String bankAccount) {
        return accounts.getOrDefault(bankAccount, 0);
    }

    @Override
    public boolean transferFunds(int amount, String sourceBackAccount, String destinationBankAccount) {
        if (accounts.getOrDefault(sourceBackAccount, 0) >= amount) {
            accounts.put(sourceBackAccount, accounts.get(sourceBackAccount) - amount);
            accounts.put(destinationBankAccount, accounts.get(destinationBankAccount) + amount);
            return true;
        } else {
            return false;
        }
    }
}
