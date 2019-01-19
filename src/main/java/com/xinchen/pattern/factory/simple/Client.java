package com.xinchen.pattern.factory.simple;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:39
 */
public class Client {
    public static void main(String[] args) {
        final ConcreteProduct product = ConcreteCreator.createProduct(ConcreteProduct.class);
        product.commonMethod();
        product.method();
    }
}
