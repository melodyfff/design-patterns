package com.xinchen.pattern.proxy.dynamic.cglib;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/13 23:21
 */
public class Client {
    public static void main(String[] args) {
        // ①. 真实对象
        Subject subject = new Subject();

        // 代理类的生成以及调用
        CglibProxyFactory proxy = new CglibProxyFactory(subject);
        final Subject proxyObject = (Subject) proxy.getInstance();
        proxyObject.method();
        // Transaction Open...
        // Hello World!
        // Transaction Commit...

        // 查看生成的代理类名字
        System.out.println(proxyObject.getClass());
        // class com.xinchen.pattern.proxy.dynamic.cglib.Subject$$EnhancerByCGLIB$$c156e2ba


        // 第二种形式代理类生成以及调用(由于代理的是同一对象，所以生成的代理类都是一致的)
        CglibProxyFactory2 factory2 = new CglibProxyFactory2(subject);

        final Subject instance = (Subject)factory2.getInstance();
        System.out.println(instance.method());
        // Transaction Open...
        // Hello World!
        // Transaction Commit...
        // ok


        System.out.println(factory2.getInstance().getClass());
        // class com.xinchen.pattern.proxy.dynamic.cglib.Subject$$EnhancerByCGLIB$$c156e2ba

    }
}
