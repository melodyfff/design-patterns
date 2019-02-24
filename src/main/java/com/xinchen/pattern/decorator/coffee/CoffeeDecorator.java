package com.xinchen.pattern.decorator.coffee;

/**
 * 装饰者
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 20:00
 */
public abstract class CoffeeDecorator implements Coffee{

    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getCost() {
        // Implementing methods of the interface
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        // Implementing methods of the interface
        return decoratedCoffee.getIngredients();
    }
}
