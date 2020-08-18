package com.xinchen.pattern.ddd.demo.exception;

import static com.google.common.collect.ImmutableMap.of;

/**
 * 系统异常
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:53
 */
public class SystemException extends AbstractDomainException{
    public SystemException(Throwable cause) {
        super(CommonErrorCode.SYSTEM_ERROR, of("detail", cause.getMessage()), cause);
    }
}
