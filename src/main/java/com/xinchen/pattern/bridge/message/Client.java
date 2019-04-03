package com.xinchen.pattern.bridge.message;

/**
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 10:28
 */
public class Client {
    public static void main(String[] args) {
        // 1. 发送普通短信消息
        MessageImplementor sms = new MessageSMS();
        AbstractMessage messageSMS = new CommonMessage(sms);
        messageSMS.sendMessage("test","sam");

        // 2. 发送加急邮件消息
        MessageImplementor email = new MessageEmail();
        AbstractMessage messageEmail = new UrgencyMessage(email);
        messageEmail.sendMessage("test","sam");
    }
}
