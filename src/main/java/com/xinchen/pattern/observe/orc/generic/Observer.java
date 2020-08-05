package com.xinchen.pattern.observe.orc.generic;

/**
 *
 * Observer
 * @param <S> Observable
 * @param <O> Observer
 * @param <A> Action
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:29
 */
public interface Observer <S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    void update(S subject, A argument);
}