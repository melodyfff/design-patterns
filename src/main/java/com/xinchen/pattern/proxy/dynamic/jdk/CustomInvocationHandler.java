package com.xinchen.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xinchen
 * @version 1.0
 * @date 17/01/2019 10:40
 */
public class CustomInvocationHandler implements InvocationHandler{

    private Object target;

    public CustomInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知...");
        final Object invoke = method.invoke(this.target, args);
        System.out.println("后置置通知...");
        return invoke;

    }
}
