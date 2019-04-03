package com.xinchen.pattern.flyweight.demo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/4/3 23:29
 */
public final class FlyWeightFactory {

    private static Map<String, FlyWeight> pool = new ConcurrentHashMap<>(16);

    private FlyWeightFactory() {
    }

    /**
     * 获取复合享元
     * @param list 内部状态列表
     * @return UnSharedFlyWeight
     */
    public static FlyWeight getCompositeFlyweight(List<String> list){
        UnSharedFlyWeight unSharedFlyWeight = new UnSharedFlyWeight();
        for (final String internal:list){
            unSharedFlyWeight.add(internal,getFlyWeight(internal));
        }
        return unSharedFlyWeight;
    }

    /**
     * 获取单纯享元
     * @param internal 内部状态
     * @return FlyWeight
     */
    public static FlyWeight getFlyWeight(String internal) {
        // 根据key获取value，如果不存在则put
        return pool.computeIfAbsent(internal, ConcreteFlyWeight::new);
    }

    public static int poolSize(){
        return pool.size();
    }

}
