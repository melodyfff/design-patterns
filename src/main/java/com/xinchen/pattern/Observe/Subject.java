package com.xinchen.pattern.Observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/26 23:36
 */
public abstract class Subject implements Observable {
    /** 观察者列表，考虑线程安全问题，替换为其他 */
    private Vector<Observer> observers = new Vector<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this,null);
        }
    }
}
