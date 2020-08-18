package com.xinchen.pattern.ddd.demo.event;

/**
 *
 * 抽象聚合事件
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:12
 */
public abstract class AbstractAggregateEvent<T> extends AbstractDomainEvent implements AggregateEvent<T>{
    private T source;

    public AbstractAggregateEvent(T source) {
        this.source = source;
    }

    @Override
    public T source() {
        return this.source;
    }
}
