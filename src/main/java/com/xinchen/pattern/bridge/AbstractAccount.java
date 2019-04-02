package com.xinchen.pattern.bridge;

import java.util.function.BooleanSupplier;

/**
 * 抽象类
 * 定义抽象的账号，日志记录操作行为和结果
 * @author xinchen
 * @version 1.0
 * @date 02/04/2019 14:10
 */
public class AbstractAccount {
    /** 自定义日志 支持 info/warn */
    private Logger logger = Logger.info();

    /**
     * 设置打印的日志
     * @param logger Logger
     */
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    /**
     * 操作记录
     * @param message 信息
     * @param action 结果
     */
    protected void operate(String message, BooleanSupplier action) {
        boolean result = action.getAsBoolean();
        logger.log(message + " result " + result);
    }
}
