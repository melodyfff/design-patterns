package com.xinchen.pattern.command.example1;

/**
 * concrete command classes
 *
 * concrete classes implementing the Order interface
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 10:48
 */
public class OrderBuyStock implements Order{
    private Stock stock;

    public OrderBuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
