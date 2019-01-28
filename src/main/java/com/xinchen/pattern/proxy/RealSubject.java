package com.xinchen.pattern.proxy;

/**
 * @author xinchen
 * @version 1.0
 * @date 16/01/2019 14:29
 */
public class RealSubject implements Subject {
    public RealSubject(String args) {
        System.out.println("RealSubject init Accept args:" + args);
    }

    @Override
    public void method(String args) {
        System.out.println("Call RealSubject method Accept args : " + args);
    }
}
