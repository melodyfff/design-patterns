package com.xinchen.pattern.proxy.dynamic.jdk;

/**
 * @author xinchen
 * @version 1.0
 * @date 17/01/2019 10:51
 */
public class BeforeAdvice implements Advice {
    @Override
    public void exec() {
        System.out.println(">>> BeforeAdvice working...");
    }
}
