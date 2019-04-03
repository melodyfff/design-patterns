package com.xinchen.pattern.bridge.message;

/**
 * 发送短信
 *
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 10:26
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String to) {
        System.out.println(String.format("发送短信消息 {%s} to {%s}", message, to));
    }
}
