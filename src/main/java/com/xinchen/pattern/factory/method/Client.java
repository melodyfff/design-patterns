package com.xinchen.pattern.factory.method;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:12
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        final ConcreteProduct product = creator.createProduct(ConcreteProduct.class);
        product.commonMethod();
        product.method();
    }
}
