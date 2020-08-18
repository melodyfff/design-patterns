package com.xinchen.pattern.ddd.demo.exception;

import static com.google.common.collect.ImmutableMap.of;

/**
 * 事件发布异常
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 16:05
 */
public class EventPublishException extends AbstractDomainException{
    public EventPublishException(Throwable cause) {
        super(CommonErrorCode.EVENT_PUBLISH_ERROR, of("detail", cause.getMessage()), cause);
    }
}
