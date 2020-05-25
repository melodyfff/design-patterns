package com.xinchen.pattern.command.example1;

/**
 *
 * concrete command classes
 *
 * concrete classes implementing the Order interface
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 10:50
 */
public class OrderSellStock implements Order{
    private Stock stock;

    public OrderSellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
