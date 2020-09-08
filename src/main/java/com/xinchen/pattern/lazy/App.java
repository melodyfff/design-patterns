package com.xinchen.pattern.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *  Lazy loading idiom defers object creation until needed.
 *
 * @author xinchen
 * @version 1.0
 * @date 08/09/2020 10:15
 */
class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // Simple lazy loader - not thread safe
        HolderNaive holderNaive = new HolderNaive();
        Coffee heavy = holderNaive.getCoffee();
        log.info("coffee={}", heavy);

        // Thread safe lazy loader, but with heavy synchronization on each access
        HolderThreadSafe holderThreadSafe = new HolderThreadSafe();
        Coffee another = holderThreadSafe.getCoffee();
        log.info("another={}", another);

        // The most efficient lazy loader utilizing Java 8 features
        Java8Holder java8Holder = new Java8Holder();
        Coffee next = java8Holder.getCoffee();
        log.info("next={}", next);

        log.info("next={}", java8Holder.getCoffee());
    }
}
