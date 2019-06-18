package com.xinchen.pattern.observe.event;

import java.util.EventObject;

/**
 * 监听器模式
 * <p>
 * 具体监听器实现类，监听事件触发时，进行的处理动作
 * 可通过{@link EventObject#getSource()} 获取事件源
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/18 22:39
 */
public class ConcreteEventListenerA implements DemoEventListener {

    @Override
    public void handleEvent(EventObject eventObject) {
        System.out.println("ConcreteEventListenerA accept eventObject , eventSource is : " + eventObject.getSource());
        if (eventObject instanceof DemoEventObject) {
            // 执行事件的回调函数/具体业务逻辑
            ((DemoEventObject) eventObject).say();
        }
    }
}
