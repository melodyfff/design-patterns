package com.xinchen.pattern.Observe.JDK;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 0:27
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ConcreteObserver accept...");
        System.out.println("Object : "+ o);
        System.out.println("Observers count: "+ o.countObservers());
    }
}
