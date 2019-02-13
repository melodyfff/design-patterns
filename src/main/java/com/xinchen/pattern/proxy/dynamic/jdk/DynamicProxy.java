package com.xinchen.pattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @author xinchen
 * @version 1.0
 * @date 17/01/2019 10:51
 */
public final class DynamicProxy {

    /** 前置通知 */
    private static final Advice beforeAdvice = new BeforeAdvice();

    public static <T extends Subject> T newProxyInstance(Subject target){

        beforeAdvice.exec();
        //noinspection unchecked
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new CustomInvocationHandler(target));
    }
}
