package com.xinchen.pattern.Observe;

/**
 * 接口声明，可被观察
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/26 23:44
 */
public interface Observable {
    /**
     * 注册观察者
     * @param observer observer
     */
    void registerObserver(Observer observer);

    /**
     * 注销观察者
     * @param observer observer
     */
    void unregisterObserver (Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
