package com.xinchen.pattern.observe;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/26 23:35
 */
public class ConcreteObserverA implements Observer{
    @Override
    public void update(Subject observable,Object arg) {
        System.out.println("ConcreteObserverA accept and update...");
        System.out.println("Object : "+ observable);
        System.out.println("args : "+ arg);
    }
}
