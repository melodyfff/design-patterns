package com.xinchen.pattern.ddd.demo.model;

/**
 * 抽象 值对象
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 14:44
 */
public abstract class ValueObject<T> extends DomainObject{
    /**
     * 没有唯一标识符的实体
     *
     * 值对象通过值 比较
     *
     * @param other 其他
     * @return 是否相等
     */
    protected abstract boolean sameValueAs(T other);
}
