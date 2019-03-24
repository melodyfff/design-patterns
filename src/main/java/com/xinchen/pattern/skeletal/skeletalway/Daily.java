package com.xinchen.pattern.skeletal.skeletalway;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/3/24 14:43
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
