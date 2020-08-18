package com.xinchen.pattern.ddd.demo.event.spring;

import com.xinchen.pattern.ddd.demo.event.DomainEvent;
import com.xinchen.pattern.ddd.demo.event.DomainEventPublisher;
import com.xinchen.pattern.ddd.demo.event.EventHandler;
import com.xinchen.pattern.ddd.demo.exception.EventHandleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * simple event publisher
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 16:33
 */
@Component
public class SimpleEventPublisher implements DomainEventPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleEventPublisher.class);
    private final Set<EventHandler> eventHandlers = new HashSet<>();

    @Override
    public void publish(DomainEvent event) {
        internalPublish(event);
    }

    @Override
    public void publishAll(List<DomainEvent> events) {
        if (null != events && !events.isEmpty()) {
            events.forEach(this::internalPublish);
        }
    }

    @Override
    public void registerEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void internalPublish(DomainEvent event) {
        eventHandlers.forEach(eventHandler -> {
            if (eventHandler.canHandle(event)) {
                try {
                    eventHandler.handle(event);
                } catch (Exception e) {
                    LOGGER.error("event handler error ", e);
                    throw new EventHandleException(e);
                }
            }
        });
    }
}
