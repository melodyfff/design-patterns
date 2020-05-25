package com.xinchen.pattern.command.example1;

/**
 *
 * a Stock class which acts as a request
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 10:41
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
