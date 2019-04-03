package com.xinchen.pattern.bridge.message;

/**
 *
 * 公共消息
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 10:16
 */
public class CommonMessage extends AbstractMessage{
    /**
     * 初始化时传入具体实现
     *
     * @param messageImplementor 消息发送
     */
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }

    @Override
    public void sendMessage(String message, String to) {
        // 调用父方法发送
        super.sendMessage(message, to);
    }
}
