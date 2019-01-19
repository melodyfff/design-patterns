package com.xinchen.pattern.factory.method;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:04
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            // Class.newInstance调用的而是类的不带参数的构造方法
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // noinspection unchecked
        return (T) product;
    }
}
