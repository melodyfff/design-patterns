package com.xinchen.pattern.factory.method;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:02
 */
public abstract class Product {
    /** 公共方法 */
    public void commonMethod() {
        System.out.println("Hello world!");
    }

    /** 具体方法延迟到子类 */
    public abstract void method();
}
