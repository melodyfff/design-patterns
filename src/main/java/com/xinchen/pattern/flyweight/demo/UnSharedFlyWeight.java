package com.xinchen.pattern.flyweight.demo;

import java.util.WeakHashMap;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/4/3 23:28
 */
public class UnSharedFlyWeight implements FlyWeight{
    /** 使用弱引用，充当缓存，当发生gc的时候直接回收 */
    private static final WeakHashMap<String, FlyWeight> CACHE = new WeakHashMap<>();



    public void add(String internal,FlyWeight flyWeight){
        synchronized (CACHE){
            CACHE.put(internal, flyWeight);
        }
    }

    @Override
    public void operation(final String external) {
        synchronized (CACHE){
            CACHE.values().forEach((flyWeight)-> flyWeight.operation(external));
        }
    }

    /**
     * 当前缓存CACHE的大小
     * @return int
     */
    public static int UnSharedFlyWeightInCache(){
        synchronized (CACHE){
            return CACHE.size();
        }
    }
}
