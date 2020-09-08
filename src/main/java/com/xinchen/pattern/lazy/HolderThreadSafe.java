package com.xinchen.pattern.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Same as HolderNaive but with added synchronization. This implementation is thread safe, but each
 * {@link #getCoffee()} call costs additional synchronization overhead.
 *
 * @author xinchen
 * @version 1.0
 * @date 08/09/2020 09:59
 */
class HolderThreadSafe {

    private static final Logger log = LoggerFactory.getLogger(HolderThreadSafe.class);

    private Coffee coffee;

    /**
     * Constructor
     */
    public HolderThreadSafe() {
        log.info("HolderThreadSafe created");
    }

    synchronized Coffee getCoffee(){
        if (null==coffee){
            coffee = new Coffee();
        }
        return coffee;
    }
}
