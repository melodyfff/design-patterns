package com.xinchen.pattern.ddd.demo.exception;

/**
 *
 * 异常编码
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:24
 */
public interface ErrorCode {
    /**
     * http 状态码  200 ....
     * @return  状态码
     */
    int getHttpStatus();

    /**
     * 描述信息
     * @return xxx
     */
    String getMessage();

    /**
     * 错误码
     * @return code
     */
    String getCode();
}
