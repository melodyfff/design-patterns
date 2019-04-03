package com.xinchen.pattern.flyweight.coffee;

/**
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 15:43
 */
public class FlyWeightExample {
    public static void main(String[] args) {
        // 1. 咖啡馆开始营业
        final CoffeeShop shop = new CoffeeShop();

        // 2. 接收订单
        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 1);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Frappe", 897);
        shop.takeOrder("Cappuccino", 97);
        shop.takeOrder("Frappe", 3);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 96);
        shop.takeOrder("Frappe", 552);
        shop.takeOrder("Cappuccino", 121);
        shop.takeOrder("Espresso", 121);

        // 3. 处理订单
        shop.service();

        // 4. 查看缓存
        System.out.println("CoffeeFlavor objects in cache: " + CoffeeFlavour.flavoursInCache());
    }
}
