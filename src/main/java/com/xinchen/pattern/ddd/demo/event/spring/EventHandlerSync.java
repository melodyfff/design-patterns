package com.xinchen.pattern.ddd.demo.event.spring;

import com.xinchen.pattern.ddd.demo.event.DomainEvent;
import com.xinchen.pattern.ddd.demo.event.EventHandler;
import com.xinchen.pattern.ddd.demo.exception.EventHandleException;
import org.springframework.beans.factory.BeanFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * 同步事件处理
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 17:03
 */
public class EventHandlerSync implements EventHandler {
    protected final Class<? extends DomainEvent> eventType;
    protected final String beanName;
    protected final Method method;
    protected final BeanFactory beanFactory;

    public EventHandlerSync(Class<? extends DomainEvent> eventType, String beanName, Method method, BeanFactory beanFactory) {
        this.eventType = eventType;
        this.beanName = beanName;
        this.method = method;
        this.beanFactory = beanFactory;
    }

    @Override
    public boolean canHandle(DomainEvent event) {
        return eventType.isAssignableFrom(event.getClass());
    }

    @Override
    public void handle(DomainEvent event) throws EventHandleException {
        final Object bean = beanFactory.getBean(beanName);
        try {
            // 反射调用
            method.invoke(bean, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new EventHandleException(e);
        }
    }
}
