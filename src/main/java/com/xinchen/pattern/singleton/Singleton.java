package com.xinchen.pattern.singleton;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 16:16
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    public void say(){
        System.out.println("Hello World!");
    }
}
