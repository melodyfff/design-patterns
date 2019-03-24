package com.xinchen.pattern.skeletal.abstractway;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/3/24 14:02
 */
public class Daily {
    public static void main(String[] args) {
        AbstractCoffeeDaily instantCoffee = new InstantCoffee();
        AbstractCoffeeDaily latteCoffee = new LatteCoffee();

        instantCoffee.process();
        System.out.println("-----------------");
        latteCoffee.process();
    }
}
