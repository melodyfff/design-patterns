package com.xinchen.pattern.ddd.demo.model;

import com.xinchen.pattern.ddd.demo.event.DomainEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合根
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 17:22
 */
public abstract class  AggregateRoot<T> extends Entity<T> {
    private List<DomainEvent> events;

    protected final void raiseEvent(DomainEvent event) {
        // raise event 等待真正需要处理的时候才publish
        getEvents().add(event);
    }

    public final void clearEvents() {
        getEvents().clear();
    }

    public final List<DomainEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<>();
        }
        return events;
    }
}
