package com.xinchen.pattern.specification;

import java.util.function.Function;

/**
 * @author xinchen
 * @version 1.0
 * @date 10/09/2020 17:05
 */
public class ExpressionSpecification<T> extends CompositeSpecification<T> {
    private Function<T, Boolean> expression;

    public ExpressionSpecification(Function<T, Boolean> expression) {
        if (null == expression){
            throw new IllegalArgumentException("expression can't be null!");
        }
        this.expression = expression;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return this.expression.apply(o);
    }
}
