package com.xinchen.pattern.Observe;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/26 23:35
 */
public class ConcreteObserverA extends Observer{
    @Override
    protected void update() {
        System.out.println("ConcreteObserverA accept and update...");
    }
}
