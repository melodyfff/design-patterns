package com.xinchen.pattern.decorator.coffee;

/**
 * 具体构件(ConcreteComponent)角色
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:57
 */
public class SimpleCoffee implements Coffee{
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
