package com.xinchen.pattern.singleton;

/**
 * 用枚举类型实现单例
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 16:23
 */
public enum  SingletonEnum {
    /** 实例部分 */
    INSTANCE{
        @Override
        protected void say() {
            System.out.println("Hello World!");
        }
    };


    protected abstract void say();
}
