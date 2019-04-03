package com.xinchen.pattern.flyweight.coffee;

import java.util.ArrayList;

/**
 * 咖啡馆
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 15:37
 */
public class CoffeeShop {
    private final ArrayList<Order> orders = new ArrayList<>();

    /**
     * 接收订单
     * @param flavour 口味
     * @param tableNumber 座位号
     */
    public void takeOrder(String flavour,int tableNumber){
        orders.add(Order.of(flavour, tableNumber));
    }

    /**
     * 处理订单
     */
    public void service(){
        orders.forEach(Order::serve);
    }
}
