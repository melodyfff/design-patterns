package com.xinchen.pattern.ddd.demo.event;

import com.xinchen.pattern.ddd.demo.model.Identity;

import java.time.Instant;

/**
 * 抽象领域事件
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:09
 */
public abstract class AbstractDomainEvent implements DomainEvent{
    private String id = Identity.newUuid();
    private Instant createAt = Instant.now();

    @Override
    public String id() {
        return this.id;
    }

    @Override
    public Instant createAt() {
        return this.createAt;
    }
}
