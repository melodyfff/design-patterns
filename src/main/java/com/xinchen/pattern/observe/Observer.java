package com.xinchen.pattern.observe;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/26 23:33
 */
public interface Observer {
    /**
     * 定义观察者接口
     * @param observable 被观察对象为Subject的子类
     * @param arg 传参
     */
    void update(Subject observable,Object arg);
}
