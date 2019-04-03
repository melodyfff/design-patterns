package com.xinchen.pattern.flyweight.demo;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/4/3 23:17
 */
public class ConcreteFlyWeight implements FlyWeight {

    private final String name;

    public ConcreteFlyWeight(String name) {
        this.name = name;
    }

    /**
     * 外部状态处理
     * @param external 外部状态
     */
    @Override
    public void operation( String external) {
        System.out.println("ConcreteFlyWeight Object = "+ this);
        System.out.println("Internal Status = " + name);
        System.out.println("External Status = " + external);
    }
}
