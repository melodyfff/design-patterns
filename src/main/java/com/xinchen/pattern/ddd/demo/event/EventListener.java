package com.xinchen.pattern.ddd.demo.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 事件监听器
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 16:10
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface EventListener {
    /**
     * 是否异步处理
     * @return true/false
     */
    boolean asynchronous() default false;
}
