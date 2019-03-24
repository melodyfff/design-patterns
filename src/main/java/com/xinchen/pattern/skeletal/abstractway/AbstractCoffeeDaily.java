package com.xinchen.pattern.skeletal.abstractway;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/3/24 13:52
 */
public abstract class AbstractCoffeeDaily {

    private String coffeeName;

    public AbstractCoffeeDaily(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void chooseCoffee(){
        System.out.println((String.format("today is %s coffee.",coffeeName)));
    }

    public void makeCoffee(){
        System.out.println((String.format("make %s coffee",coffeeName)));
    }

    public void drinkCoffee(){
        System.out.println((String.format("drink %s coffee",coffeeName)));
    }

    protected final void process(){
        this.chooseCoffee();
        this.makeCoffee();
        this.drinkCoffee();
    }

}
