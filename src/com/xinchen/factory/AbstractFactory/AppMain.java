package com.xinchen.factory.AbstractFactory;

/**
 * 抽象工厂
 *
 * @author Xin Chen
 */
public class AppMain {

    public static void main(String[] args) {
        FactoryB fB = new FactoryB();
        fB.createGirl();
        fB.createGoddess();
        FactoryC fC = new FactoryC();
        fC.createGirl();
        fC.createGoddess();
    }

}
