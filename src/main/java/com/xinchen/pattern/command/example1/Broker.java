package com.xinchen.pattern.command.example1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * command invoker class
 *
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 10:51
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        orderList.forEach(Order::execute);
        orderList.clear();
    }

}
