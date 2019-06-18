package com.xinchen.pattern.observe.event;

import java.util.EventListener;
import java.util.EventObject;

/**
 *
 * 事件监听器模式
 *
 * 监听器接口 继承自 {@link EventListener},拓展标记该接口为监听器
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/18 22:36
 */
public interface DemoEventListener extends EventListener {

    /**
     * 处理事件
     * @param eventObject EventObject
     */
    void handleEvent(EventObject eventObject);
}
