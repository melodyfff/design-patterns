package com.xinchen.pattern.factory.simple;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:37
 */
public class ConcreteCreator {
    public static <T extends Product> T createProduct(Class<T> cls){
        Product product = null;
        try {
            // Class.newInstance调用的而是类的不带参数的构造方法
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // noinspection unchecked
        return (T) product;
    }
}
