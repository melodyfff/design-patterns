package com.xinchen.pattern.observe.event;

import java.util.EventObject;

/**
 *
 * 监听器模式
 *
 * 事件对象封装
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/18 22:45
 */
public class DemoEventObject extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DemoEventObject(Object source) {
        super(source);
    }


    /**
     * 事件的回调或者业务逻辑
     */
    public void say() {
        System.out.println("this is " + this + " to say");
    }
}
