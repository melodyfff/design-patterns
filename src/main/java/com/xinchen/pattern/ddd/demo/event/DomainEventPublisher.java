package com.xinchen.pattern.ddd.demo.event;

import java.util.List;

/**
 *
 * 领域事件发布器
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:16
 */
public interface DomainEventPublisher {
    /**
     * 事件发布
     * @param domainEvent domainEvent
     */
    void publish(DomainEvent domainEvent);

    /**
     * 事件发布 all
     * @param domainEvents 所有事件
     */
    void publishAll(List<DomainEvent> domainEvents);

    /**
     * 注册事件处理器
     * @param eventHandler eventHandler
     */
    void registerEventHandler(EventHandler eventHandler);
}
