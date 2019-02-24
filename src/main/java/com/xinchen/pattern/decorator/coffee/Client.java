package com.xinchen.pattern.decorator.coffee;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 20:08
 */
public class Client {
    public static void printInfo(Coffee c){
        System.out.println("Cost: " + c.getCost()+" ; Ingredients: "+c.getIngredients());
    }


    public static void main(String[] args) {

        Coffee coffee = new WithMilk(new WithSugar(new SimpleCoffee()));
        coffee.getCost();
        coffee.getIngredients();
        printInfo(coffee);
        // Cost: 1.7 ; Ingredients: Coffee, Sugar, Milk
    }
}
