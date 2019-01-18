package com.xinchen.pattern.proxy;

/**
 * @author xinchen
 * @version 1.0
 * @date 16/01/2019 14:29
 */
public class RealSubject implements Subject {
    @Override
    public void method() {
        System.out.println("do something...");
    }
}
