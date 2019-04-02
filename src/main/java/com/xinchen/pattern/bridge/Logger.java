package com.xinchen.pattern.bridge;

/**
 * 自定义日志打印接口
 *
 * @author xinchen
 * @version 1.0
 * @date 02/04/2019 14:07
 */
@FunctionalInterface
public interface Logger {

    /**
     * 打印日志
     * @param message message
     */
    void log(String message);

    /**
     * info级别日志
     * @return LOGGER
     */
    static Logger info(){
        return message -> System.out.println("info: " + message);
    }

    /**
     * warn级别日志
     * @return LOGGER
     */
    static Logger warning(){
        return message -> System.out.println("warning: " + message);
    }
}
