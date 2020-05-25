package com.xinchen.pattern.command.example1;

/**
 *
 * 命令模式例子
 *
 * https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 *
 * <pre>
 *     We have created an interface {@link Order} which is acting as a command.
 *     We have created a {@link Stock} class which acts as a request.
 *     We have concrete command classes {@link OrderBuyStock} and {@link OrderSellStock} implementing Order interface which will do actual command processing.
 *     A class {@link Broker} is created which acts as an invoker object. It can take and place orders
 * </pre>
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 10:56
 */
public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();

        // 创建购买和销售命令
        OrderBuyStock buyStock = new OrderBuyStock(stock);
        OrderSellStock sellStock = new OrderSellStock(stock);

        // 创建经纪人接收命令
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        // 执行命令
        broker.placeOrders();
//        Stock [ Name: ABC, Quantity: 10 ] bought
//        Stock [ Name: ABC, Quantity: 10 ] sold
    }
}
