package com.xinchen.pattern.observe;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/26 23:47
 */
public class Client {
    public static void main(String[] args) {
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        ConcreteSubjectA subject = new ConcreteSubjectA();
        subject.registerObserver(observerA);
        subject.registerObserver(observerB);
        subject.setData("ok");

        subject.unregisterObserver(observerB);
        subject.setData("test");
    }
}
