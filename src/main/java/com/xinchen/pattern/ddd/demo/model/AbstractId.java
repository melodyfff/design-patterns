package com.xinchen.pattern.ddd.demo.model;


import java.util.Objects;

/**
 * 抽象 聚合ID
 *
 * Aggregate中标示唯一的标志
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 14:27
 */
public abstract class AbstractId extends ValueObject<AbstractId> implements Identity {
    private String aggregateId;

    public AbstractId(String aggregateId) {
        this.aggregateId = aggregateId;
    }

    public void setAggregateId(String aggregateId) {
        this.assertArgumentNotEmpty(aggregateId,"实体标识不能为空.");
        this.aggregateId = aggregateId;
    }

    @Override
    public String id() {
        return this.aggregateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractId that = (AbstractId) o;
        return this.sameValueAs(that);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [aggregateId=" + aggregateId + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregateId);
    }

    @Override
    protected boolean sameValueAs(AbstractId other) {
        return other != null && this.aggregateId.equals(other.aggregateId);
    }
}
