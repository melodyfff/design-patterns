package com.xinchen.pattern.flyweight.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/4/3 23:55
 */
public class Client {
    public static void main(String[] args) {

        List<String> internals = Arrays.asList("test1", "test2");

        // 单纯享元
        final FlyWeight concreteFlyWeight1 = FlyWeightFactory.getFlyWeight(internals.get(0));
        concreteFlyWeight1.operation("concreteFlyWeight1");
        final FlyWeight concreteFlyWeight2 = FlyWeightFactory.getFlyWeight(internals.get(0));
        concreteFlyWeight2.operation("concreteFlyWeight2");
        System.out.println(concreteFlyWeight1 == concreteFlyWeight2);
        System.out.println(FlyWeightFactory.poolSize());

        System.out.println("\n\n\n");

        // 复合享元
        final FlyWeight compositeFlyweight1 = FlyWeightFactory.getCompositeFlyweight(internals);
        final FlyWeight compositeFlyweight2 = FlyWeightFactory.getCompositeFlyweight(internals);
        compositeFlyweight1.operation("compositeFlyweight1");
        compositeFlyweight2.operation("compositeFlyweight2");
        System.out.println(compositeFlyweight1);
        System.out.println(compositeFlyweight2);
        System.out.println(compositeFlyweight1 == compositeFlyweight2);
        System.out.println(UnSharedFlyWeight.UnSharedFlyWeightInCache());
    }
}
