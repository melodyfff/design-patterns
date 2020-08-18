package com.xinchen.pattern.ddd.demo.model;

/**
 * 抽象实体类
 *
 * 实体应该具有唯一的标识符,{@link Identity}
 *
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 14:47
 */
public abstract class Entity<T> extends DomainObject implements Identity {
    /**
     * 实体通过标识进行比较
     * @param other  实体
     * @return 是否相同
     */
    protected abstract boolean sameIdentityAs(T other);
}
