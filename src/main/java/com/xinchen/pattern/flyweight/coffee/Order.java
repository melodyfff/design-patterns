package com.xinchen.pattern.flyweight.coffee;

/**
 * 排队那号等服务
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 15:29
 */
@FunctionalInterface
public interface Order {
    /**
     * 服务
     */
    void serve();

    /**
     * 接收处理订单
     * @param flavourName 口味 （可认为是内部状态Internal State）
     * @param taleNumber 桌号 （可认为是外部状态External State）
     * @return
     */
    static Order of(String flavourName,int taleNumber){
        CoffeeFlavour flavour = CoffeeFlavour.intern(flavourName);
        return () -> System.out.println("Serving " + flavour + " to table " + taleNumber);
    }
}
