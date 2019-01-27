package com.xinchen.pattern.factory.ibstract;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 18:17
 */
public class FactoryA implements AbstractFactory{
    @Override
    public <T extends ProductA> T createProductA(Class<T> cls) {
        if (null != cls){
            try {
                final Object o = Class.forName(cls.getName()).newInstance();
                // noinspection unchecked
                return (T) o;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public <T extends ProductB> T createProductB(Class<T> cls) {
        if (null != cls){
            try {
                final Object o = Class.forName(cls.getName()).newInstance();
                // noinspection unchecked
                return (T) o;
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
