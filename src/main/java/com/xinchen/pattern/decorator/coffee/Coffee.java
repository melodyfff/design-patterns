package com.xinchen.pattern.decorator.coffee;

/**
 * 抽象构件(Component)角色
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:56
 */
public interface Coffee {
    /**
     *
     * @return Returns the cost of the coffee
     */
    double getCost();

    /**
     *
     * @return Returns the ingredients(配料) of the coffee
     */
    String getIngredients();
}
