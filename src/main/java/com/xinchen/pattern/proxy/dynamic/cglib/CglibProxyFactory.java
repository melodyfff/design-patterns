package com.xinchen.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/13 23:11
 */
public class CglibProxyFactory implements MethodInterceptor {

    /** 被代理对象 */
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);

        // 创建代理对象
        return enhancer.create();
    }

    /**
     *
     * @param proxy cglib动态生成的代理实例
     * @param method 被代理的方法
     * @param args method方法调用传入参数
     * @param methodProxy 生成的代理类对方法的代理引用
     * @return 方法执行完成后的返回值
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("Transaction Open...");
        final Object invoke = method.invoke(target, args);
        System.out.println("Transaction Commit...");
        // 获取方法执行后的返回
        return invoke;
    }
}
