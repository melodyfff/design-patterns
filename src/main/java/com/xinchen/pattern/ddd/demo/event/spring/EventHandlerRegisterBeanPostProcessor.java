package com.xinchen.pattern.ddd.demo.event.spring;

import com.google.common.base.Preconditions;
import com.xinchen.pattern.ddd.demo.event.DomainEvent;
import com.xinchen.pattern.ddd.demo.event.DomainEventPublisher;
import com.xinchen.pattern.ddd.demo.event.EventHandler;
import com.xinchen.pattern.ddd.demo.event.EventListener;
import com.xinchen.pattern.ddd.demo.event.EventListeners;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *
 * 基于spring的领域事件注册器
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 16:17
 */
@Component
public class EventHandlerRegisterBeanPostProcessor implements BeanPostProcessor, BeanFactoryAware {

    private BeanFactory beanFactory;
    private DomainEventPublisher eventPublisher;


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (null!=bean.getClass().getAnnotation(EventListeners.class)){
            for (Method method : bean.getClass().getDeclaredMethods()) {
                EventListener listenerAnnotation = method.getAnnotation(EventListener.class);
                if (listenerAnnotation == null) {
                    continue;
                }

                Class[] eventTypeParams = method.getParameterTypes();
                Preconditions.checkArgument(eventTypeParams.length == 1,
                        beanName + "#" + method.getName() + "只能有一个参数（DomainEvent）");

                EventHandler handler;
                // non match return normal error
                final Class<? extends DomainEvent> eventTypeParam = eventTypeParams[0];
                if(listenerAnnotation.asynchronous()){
                    handler = new EventHandlerAsync(eventTypeParam, beanName, method, beanFactory);
                }else{
                    handler = new EventHandlerSync(eventTypeParam, beanName, method, beanFactory);
                }
                eventPublisher.registerEventHandler(handler);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        this.eventPublisher = beanFactory.getBean(SimpleEventPublisher.class);
    }
}
