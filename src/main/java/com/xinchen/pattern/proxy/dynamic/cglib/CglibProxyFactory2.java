package com.xinchen.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/13 23:54
 */
public class CglibProxyFactory2 {

    private Object target;

    public CglibProxyFactory2(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("Transaction Open...");
                final Object invoke = method.invoke(target, args);
                System.out.println("Transaction Commit...");
                // 获取方法执行后的返回
                return invoke;
            }
        });
        return enhancer.create();
    }
}
