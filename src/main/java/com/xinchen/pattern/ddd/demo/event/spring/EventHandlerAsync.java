package com.xinchen.pattern.ddd.demo.event.spring;

import com.xinchen.pattern.ddd.demo.event.DomainEvent;
import com.xinchen.pattern.ddd.demo.exception.EventHandleException;
import org.springframework.beans.factory.BeanFactory;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

/**
 *
 * 异步事件处理
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 17:13
 */
public class EventHandlerAsync extends EventHandlerSync{
    public EventHandlerAsync(Class<? extends DomainEvent> eventType, String beanName, Method method, BeanFactory beanFactory) {
        super(eventType, beanName, method, beanFactory);
    }

    @Override
    public void handle(DomainEvent event) throws EventHandleException {
        ExecutorService executorService = beanFactory.getBean(ExecutorService.class);
        executorService.submit(() -> super.handle(event));
    }
}
