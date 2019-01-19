package com.xinchen.pattern.singleton;

/**
 * 懒加载
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 15:58
 */
public class SingletonLazy {
    /** volatile 防止编译优化打乱顺序,造成线程安全问题 */
    private volatile static SingletonLazy singleton;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        // 双重检查
        if (null == singleton){
            synchronized (SingletonLazy.class){
                if (null == singleton){
                    singleton = new SingletonLazy();
                }
            }
        }

        return singleton;
    }

    public void say(){
        System.out.println("Hello World!");
    }
}
