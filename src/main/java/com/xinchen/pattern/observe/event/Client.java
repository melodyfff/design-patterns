package com.xinchen.pattern.observe.event;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/18 22:51
 */
public class Client {
    public static void main(String[] args) {

        // 初始化监听器
        DemoEventListener demoEventListenerA = new ConcreteEventListenerA();
        DemoEventListener demoEventListenerB = new ConcreteEventListenerB();

        // 事件源A
        DemoEventSource demoEventSource1 = new DemoEventSource();
        demoEventSource1.addListener(demoEventListenerA);
        demoEventSource1.addListener(demoEventListenerB);
        demoEventSource1.notifyListenerEvents(new DemoEventObject(demoEventSource1));

        // 事件源B
        DemoEventSource demoEventSource2 = new DemoEventSource();
        demoEventSource2.addListener(demoEventListenerB);
        demoEventSource2.notifyListenerEvents(new DemoEventObject(demoEventSource2));
    }
}
