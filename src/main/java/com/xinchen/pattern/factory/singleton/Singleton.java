package com.xinchen.pattern.factory.singleton;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:58
 */
public class Singleton {

    /** 约定将构造方法设置为private */
    private Singleton(){}

    public void say(){
        System.out.println("Hello World!");
    }
}
