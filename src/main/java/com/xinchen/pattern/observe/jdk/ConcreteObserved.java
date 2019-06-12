package com.xinchen.pattern.observe.jdk;

import java.util.Observable;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 0:27
 */
public class ConcreteObserved extends Observable {

    private String data;

    public void setData(String data) {
        this.data = data;
        // 设置发生了变化,将 Change 设置为true
        this.setChanged();
        // 通知观察者们，并将 Change 设置为false
        this.notifyObservers();
    }
}
