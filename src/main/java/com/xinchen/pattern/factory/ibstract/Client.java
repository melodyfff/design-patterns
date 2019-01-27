package com.xinchen.pattern.factory.ibstract;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 18:23
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryA();

        final ConcreteProductA productA = factory.createProductA(ConcreteProductA.class);
        final ConcreteProductB productB = factory.createProductB(ConcreteProductB.class);
        // init ConcreteProductA...
        // init ConcreteProductB...
    }
}
