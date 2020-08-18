package com.xinchen.pattern.ddd.demo.exception;

/**
 * 通用异常编码
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:25
 */
public enum CommonErrorCode implements ErrorCode{
    /**系统错误*/
    SYSTEM_ERROR(500, "系统内部错误","001"),
    EVENT_HANDLE_ERROR(500, "事件处理错误","002"),
    EVENT_PUBLISH_ERROR(500, "事件发布错误","001");

    private int status;
    private String message;
    private String code;

    CommonErrorCode(int status, String message, String code) {
        this.status = status;
        this.message = message;
        this.code = code;
    }

    @Override
    public int getHttpStatus() {
        return this.status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getCode() {
        return this.code;
    }


}
