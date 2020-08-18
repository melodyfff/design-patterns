package com.xinchen.pattern.ddd.demo.event;

import com.xinchen.pattern.ddd.demo.model.Identity;

/**
 * 聚合根事件
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:07
 */
public interface AggregateEvent<T> extends DomainEvent {
    /**
     * 事件内容
     * @return T
     */
    T source();

    /**
     * 聚合唯一标识
     * @return Identity
     */
    Identity aggregateId();
}
