package com.xinchen.pattern.ddd.demo.event;

import com.xinchen.pattern.ddd.demo.exception.EventHandleException;

/**
 *
 * 事件处理器
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:18
 */
public interface EventHandler {
    /**
     * 是否能处理该事件
     * @param event 领域事件
     * @return 是否
     */
    boolean canHandle(DomainEvent event);

    /**
     * 事件处理
     * @param event 域事件
     * @throws EventHandleException 处理失败
     */
    void handle(DomainEvent event) throws EventHandleException;
}
