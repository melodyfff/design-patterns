package com.xinchen.pattern.bridge;

/**
 * @author xinchen
 * @version 1.0
 * @date 02/04/2019 14:21
 */
public class BridgeDemo {
    public static void main(String[] args) {
        // 1. 初始化账号
        SimpleAccount account = new SimpleAccount(100);

        // 2. 取出75
        account.withdraw(75);

        // 3. 判断余额是否已经到警戒值，切换日志级别
        if (account.isBalanceLow()){
            account.setLogger(Logger.warning());
        }

        // 4. 取出10
        account.withdraw(10);

        // 5. 取出100
        account.withdraw(100);
    }
}
