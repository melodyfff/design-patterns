package com.xinchen.pattern.singleton;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 16:14
 */
public class Client {
    public static void main(String[] args) {
        final Singleton singleton = Singleton.getInstance();
        final Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);


        final SingletonLazy singletonLazy = SingletonLazy.getInstance();
        final SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy1);


        final SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        final SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum.hashCode());
        System.out.println(singletonEnum1.hashCode());

    }
}
