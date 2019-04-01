package com.xinchen.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/4/1 22:50
 */
public class Context {
    private final List<Integer> drinks = new ArrayList<>();
    private Strategy strategy;

    /**
     * 初始化策略
     * @param strategy 策略
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 添加商品
     * @param price 价格
     * @param quantity 数量
     */
    public void add(int price, int quantity) {
        this.drinks.add(this.strategy.getPrice(price * quantity));
    }

    /**
     * 打印最终价格
     */
    public void print() {
        // 计算总价
        int sum = this.drinks.stream().mapToInt((v) -> v).sum();
        // 输出
        System.out.println("Total cost: " + sum);
        // 清空
        this.drinks.clear();
    }

    /**
     * 设置策略
     * @param strategy 策略
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
