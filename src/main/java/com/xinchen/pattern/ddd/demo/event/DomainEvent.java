package com.xinchen.pattern.ddd.demo.event;

import java.io.Serializable;
import java.time.Instant;

/**
 *
 * 领域事件
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 15:06
 */
public interface DomainEvent extends Serializable {
    /**
     * 事件标识
     * @return  id
     */
    String id();

    /**
     * 事件发生时间
     * @return instant
     */
    Instant createAt();
}
