package com.xinchen.pattern.hexagonal.lottery.domain;

/**
 * Lottery domain constants
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 13:34
 */
public final class LotteryConstants {
    private LotteryConstants() {
    }

    /** 奖金 */
    public static final int PRIZE_AMOUNT = 100000;
    /** 服务的银行账号 */
    public static final String SERVICE_BANK_ACCOUNT = "123-123";
    /** 每张彩票价格 */
    public static final int TICKET_PRIZE = 3;
    public static final int SERVICE_BANK_ACCOUNT_SALDO = 150000;
    /** 玩家账户资金最大值 - 初始化时 */
    public static final int PLAYER_MAX_SALDO = 100;
}
