package com.xinchen.pattern.specification;

/**
 * @author xinchen
 * @version 1.0
 * @date 10/09/2020 11:42
 */
public class SpecificationNot<T> extends CompositeSpecification<T> {
    private Specification<T> specification;

    public SpecificationNot(Specification<T> specification) {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return !this.specification.isSatisfiedBy(o);
    }
}
