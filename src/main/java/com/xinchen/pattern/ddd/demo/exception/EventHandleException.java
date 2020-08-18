package com.xinchen.pattern.ddd.demo.exception;

import static com.google.common.collect.ImmutableMap.of;

/**
 *
 * 事件处理异常
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:59
 */
public class EventHandleException extends AbstractDomainException{
    public EventHandleException(Throwable cause) {
        super(CommonErrorCode.EVENT_HANDLE_ERROR, of("detail", cause.getMessage()), cause);
    }
}
