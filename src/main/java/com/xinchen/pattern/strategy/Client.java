package com.xinchen.pattern.strategy;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/4/1 22:55
 */
public class Client {
    public static void main(String[] args) {
        final Strategy normalStrategy = Strategy.normalStrategy();
        final Strategy discountStrategy = Strategy.discountStrategy();

        Context customer1 = new Context(normalStrategy);

        //----常规价格------
        customer1.add(100, 1);


        //----开始打折------
        // 半价

        customer1.setStrategy(discountStrategy);
        customer1.add(100, 2);
        // 打印价格
        customer1.print();
        // Total cost: 200


        Context customer2 = new Context(discountStrategy);
        customer2.add(100, 1);
        customer2.add(100, 1);
        //----打折结束------


        customer2.setStrategy(normalStrategy);
        customer2.add(100, 1);
        // 打印价格
        customer2.print();
        // Total cost: 200
    }
}
