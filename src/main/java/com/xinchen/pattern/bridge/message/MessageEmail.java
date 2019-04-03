package com.xinchen.pattern.bridge.message;

/**
 * 发送邮件
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 10:27
 */
public class MessageEmail implements MessageImplementor{
    @Override
    public void send(String message, String to) {
        System.out.println(String.format("发送邮件消息 {%s} to {%s}", message, to));
    }
}
