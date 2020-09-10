package com.xinchen.pattern.specification;

/**
 * 组合规约
 *
 * @author xinchen
 * @version 1.0
 * @date 10/09/2020 11:11
 */
abstract class CompositeSpecification<T> implements Specification<T>{
    @Override
    public Specification<T> and(Specification<T> specification) {
        return new SpecificationAnd<>(this,specification);
    }

    @Override
    public Specification<T> or(Specification<T> specification) {
        return new SpecificationOr<>(this,specification);
    }

    @Override
    public Specification<T> not(Specification<T> specification) {
        return new SpecificationNot<>(specification);
    }
}
