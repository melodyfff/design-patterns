package com.xinchen.pattern.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

/**
 *
 * This lazy loader is thread safe and more efficient than {@link HolderThreadSafe}. It utilizes
 * Java 8 functional interface {@link Supplier} as {@link Coffee} factory.
 *
 * @author xinchen
 * @version 1.0
 * @date 08/09/2020 10:02
 */
class Java8Holder {

    private static final Logger log = LoggerFactory.getLogger(Java8Holder.class);

    private Supplier<Coffee> coffee = this::createAndCacheCoffee;

    public Java8Holder() {
        log.info("Java8Holder created");
    }

    Coffee getCoffee(){
        return coffee.get();
    }

    private synchronized Coffee createAndCacheCoffee(){
        class CoffeeFactory implements Supplier<Coffee>{
            private final Coffee coffeeInstance = new Coffee();
            @Override
            public Coffee get() {
                return coffeeInstance;
            }
        }

        if (!(coffee instanceof CoffeeFactory)){
            coffee = new CoffeeFactory();
        }

        return coffee.get();
    }
}
