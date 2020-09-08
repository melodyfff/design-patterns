package com.xinchen.pattern.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Coffee objects are expensive to create
 *
 * 创建代价高昂的对象
 *
 * @author xinchen
 * @version 1.0
 * @date 08/09/2020 09:53
 */
class Coffee {

    private static final Logger log = LoggerFactory.getLogger(Coffee.class);

    /**
     * Constructor
     */
    public Coffee() {
        log.info("Creating Coffee...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            log.error("Exception caught.",e);
        }
        log.info("... Coffee created");
    }
}
