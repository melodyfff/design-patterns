package com.xinchen.pattern.observe.event;

import java.util.EventObject;
import java.util.Vector;

/**
 * 监听器模式
 *
 * 事件源
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/18 22:29
 */
public class DemoEventSource {

    /** 监听器列表 */
    public Vector<DemoEventListener> listeners = new Vector<>();

    /**
     * 注册监听器
     * @param listener EventListener
     */
    public void addListener(DemoEventListener listener) {
        listeners.add(listener);
    }

    /**
     * 撤销监听器
     * @param listener EventListener
     */
    public void removeListener(DemoEventListener listener) {
        listeners.remove(listener);
    }


    /**
     * 通知所有监听器,包裹事件源成为事件
     * @param eventObject EventObject
     */
    public void notifyListenerEvents(EventObject eventObject){
        listeners.forEach(listener ->{
            listener.handleEvent(eventObject);
        });
    }
}
