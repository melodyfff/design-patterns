package com.xinchen.pattern.skeletal.interfaceway;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/3/24 1:39
 */
public class Daily {
    public static void main(String[] args) {
        InstantCoffee instantCoffee = new InstantCoffee();
        LatteCoffee latteCoffee = new LatteCoffee();

        instantCoffee.process();
        System.out.println("-----------------");
        latteCoffee.process();
    }
}
