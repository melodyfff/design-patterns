package com.xinchen.pattern.bridge.message;

/**
 *
 * 抽象消息类
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 10:11
 */
public abstract class AbstractMessage {
    /** 消息发送接口 */
    MessageImplementor messageImplementor;

    /**
     * 初始化时传入具体实现
     * @param messageImplementor 消息发送
     */
    public AbstractMessage(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }

    /**
     * 发送消息，委派给MessageImplementor的具体实现
     * @param message 消息
     * @param to 发送对象
     */
    public void sendMessage(String message,String to){
        this.messageImplementor.send(message,to);
    }
}
