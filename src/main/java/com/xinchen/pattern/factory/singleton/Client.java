package com.xinchen.pattern.factory.singleton;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 18:03
 */
public class Client {
    public static void main(String[] args) {
        SingletonFactory.getInstance().say();
    }
}
