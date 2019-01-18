package com.xinchen.pattern.proxy.dynamic;

/**
 * @author xinchen
 * @version 1.0
 * @date 18/01/2019 13:14
 */
public class Client {
    public static void main(String[] args) {
        final Subject o = DynamicProxy.newProxyInstance(new RealSubject());
        o.method();
    }
}
