package com.xinchen.pattern.factory.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:59
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            final Class cls = Class.forName(Singleton.class.getName());
            final Constructor constructor = cls.getDeclaredConstructor();

            // 将构造函数设置为可访问
            constructor.setAccessible(true);

            singleton = (Singleton) constructor.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
