package com.xinchen.pattern.proxy.dynamic;

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

        return method.invoke(this.target,args);

    }
}
