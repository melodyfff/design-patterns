package com.xinchen.pattern.bridge.message;

/**
 *
 * 消息发送统一接口
 *
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 10:10
 */
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message 消息
     * @param to 发送对象
     */
    void send(String message, String to);

}
