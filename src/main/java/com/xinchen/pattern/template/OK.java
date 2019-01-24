package com.xinchen.pattern.template;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/14 23:45
 */
public class OK {
    public static void main(String[] args) {
        final AbstractCoffeeMake coffeeMake = new InstantCoffeeMake();
        coffeeMake.make();

        final LatteCoffeeMake latteCoffeeMake = new LatteCoffeeMake();
        latteCoffeeMake.setNeedSugar(false);
        latteCoffeeMake.make();
    }
}
