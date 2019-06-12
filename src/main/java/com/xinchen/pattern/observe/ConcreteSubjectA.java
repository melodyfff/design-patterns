package com.xinchen.pattern.observe;

/**
 * 被观察对象
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/26 23:46
 */
public class ConcreteSubjectA extends Subject{

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        // 通知观察者，数据发生改变
        notifyObservers();
    }
}
