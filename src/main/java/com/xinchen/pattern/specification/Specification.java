package com.xinchen.pattern.specification;

/**
 * 规约模式
 *
 * 每个规约实现四个方法：IsSatisfiedBy()、And()、Or()、Not()。
 * IsSatisfiedBy()方法主要实现业务规则，而其它三个则用来将复合业务规则连在一起。
 *
 * 参考： https://www.cnblogs.com/youring2/p/Specification-Pattern.html
 *
 * @author xinchen
 * @version 1.0
 * @date 10/09/2020 11:07
 */
public interface Specification<T> {

    boolean isSatisfiedBy(T o);

    Specification<T> and(Specification<T> specification);
    Specification<T> or(Specification<T> specification);
    Specification<T> not(Specification<T> specification);
}
