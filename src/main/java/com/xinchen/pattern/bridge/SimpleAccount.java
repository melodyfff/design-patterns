package com.xinchen.pattern.bridge;

/**
 * 账号
 *
 * @author xinchen
 * @version 1.0
 * @date 02/04/2019 14:14
 */
public class SimpleAccount extends AbstractAccount {

    /**
     * 余额
     */
    private int balance;

    /**
     * 初始化账号余额
     *
     * @param balance balance
     */
    public SimpleAccount(int balance) {
        this.balance = balance;
    }

    /**
     * 判断是否快余额不足
     * 判断条件为小于50
     *
     * @return boolean
     */
    public boolean isBalanceLow() {
        return this.balance < 50;
    }

    /**
     * 取出余额
     *
     * @param amount 数量
     */
    public void withdraw(int amount) {
        operate("withdraw " + amount, () -> {
            if (this.balance >= amount) {
                this.balance -= amount;
                return true;
            }
            return false;
        });
    }

}
