package com.xinchen.pattern.ddd.demo.exception;


import java.util.HashMap;
import java.util.Map;


/**
 * 抽象领域异常
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:24
 */
public class AbstractDomainException extends RuntimeException{
    private final ErrorCode error;
    private final Map<String, Object> data = new HashMap<>();

    protected AbstractDomainException(ErrorCode error, Map<String, Object> data) {
        super(format(error.getCode(), error.getMessage(), data));
        this.error = error;
        if (!isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected AbstractDomainException(ErrorCode code, Map<String, Object> data, Throwable cause) {
        super(format(code.toString(), code.getMessage(), data), cause);
        this.error = code;
        if (!isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    private static String format(String code, String message, Map<String, Object> data) {
        return String.format("[%s] %s:%s.", code, message, isEmpty(data) ? "" : data.toString());
    }

    public ErrorCode getError() {
        return error;
    }

    public Map<String, Object> getData() {
        return data;
    }

    private static boolean isEmpty(Map<?, ?> map){
        return null == map || map.isEmpty();
    }
}
