package com.xinchen.pattern.Observe.JDK;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 0:29
 */
public class Client {
    public static void main(String[] args) {
        ConcreteObserver observer = new ConcreteObserver();

        ConcreteObserved observed = new ConcreteObserved();
        observed.addObserver(observer);
        observed.setData("ok");
    }
}
