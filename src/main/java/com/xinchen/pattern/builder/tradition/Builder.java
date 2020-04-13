package com.xinchen.pattern.builder.tradition;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/12 23:15
 */
public interface Builder {

    /**
     * 创建日志对象
     * @return LogObject
     */
    LogObject build();

    /**
     * 创建日志对象，并打印日志对象
     * @return LogObject
     */
    LogObject buildAndLog();
}
