package com.xinchen.pattern.proxy.dynamic.jdk;

/**
 * @author xinchen
 * @version 1.0
 * @date 17/01/2019 10:39
 */
public class RealSubject implements Subject{

    @Override
    public void method() {
        System.out.println("do something...");
    }
}
