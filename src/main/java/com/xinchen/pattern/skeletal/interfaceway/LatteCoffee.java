package com.xinchen.pattern.skeletal.interfaceway;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/3/24 1:37
 */
public class LatteCoffee implements CoffeeDaily{
    @Override
    public void chooseCoffee() {
        System.out.println("today is latte coffee.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("make latte coffee");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("drink latte coffee");
    }

    @Override
    public void process() {
        chooseCoffee();
        makeCoffee();
        drinkCoffee();
    }
}
