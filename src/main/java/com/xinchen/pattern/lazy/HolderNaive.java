package com.xinchen.pattern.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple implementation of the lazy loading idiom. However, this is not thread safe.
 *
 * @author xinchen
 * @version 1.0
 * @date 08/09/2020 09:54
 */
class HolderNaive {

    private static final Logger log = LoggerFactory.getLogger(HolderNaive.class);

    private Coffee coffee;

    /**
     * Constructor
     */
    public HolderNaive() {
        log.info("HolderNative created");
    }

    Coffee getCoffee(){
        if (null == coffee){
            coffee = new Coffee();
        }
        return coffee;
    }
}
