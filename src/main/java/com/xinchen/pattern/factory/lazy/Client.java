package com.xinchen.pattern.factory.lazy;

/**
 * @author xinchen
 * @version 1.0
 * @date 24/01/2019 14:24
 */
public class Client {
    public static void main(String[] args) {
        final Product concreteProduct = ProductFactory.createProduct(ConcreteProduct.class);
        final Product concreteProduct1 = ProductFactory.createProduct(ConcreteProduct.class);

        System.out.println(concreteProduct.hashCode());
        System.out.println(concreteProduct1.hashCode());
    }
}
