package com.xinchen.pattern.bridge.message;

/**
 * 加急消息
 *
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 10:19
 */
public class UrgencyMessage extends AbstractMessage {

    /**
     * 初始化时传入具体实现
     *
     * @param messageImplementor 消息发送
     */
    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String message, String to) {
        // 加入自己的处理逻辑
        message = "[加急] " + message;
        super.sendMessage(message, to);
    }

    /**
     * 拓展自己功能，获取某个消息的状态
     * @param messageId messageId
     * @return Object
     */
    public Object call(String messageId){
        // 加入具体业务逻辑
        return null;
    }
}
