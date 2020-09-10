package com.xinchen.pattern.specification;

/**
 * @author xinchen
 * @version 1.0
 * @date 10/09/2020 11:42
 */
public class SpecificationOr<T> extends CompositeSpecification<T> {
    private Specification<T> leftSpecification;
    private Specification<T> rightSpecification;

    public SpecificationOr(Specification<T> leftSpecification, Specification<T> rightSpecification) {
        this.leftSpecification = leftSpecification;
        this.rightSpecification = rightSpecification;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return this.leftSpecification.isSatisfiedBy(o)||this.rightSpecification.isSatisfiedBy(o);
    }
}
