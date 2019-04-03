package com.xinchen.pattern.flyweight.coffee;

import java.util.WeakHashMap;

/**
 * 咖啡口味
 * @author xinchen
 * @version 1.0
 * @date 03/04/2019 15:06
 */
public class CoffeeFlavour {

    /** name可认为是内部状态，在构造时确定 */
    private final String name;

    /** 使用弱引用，充当缓存，当发生gc的时候直接回收 */
    private static final WeakHashMap<String, CoffeeFlavour> CACHE = new WeakHashMap<>();

    /** only intern() can call this */
    private CoffeeFlavour(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * 根据key从CACHE中获取value
     * @param name key
     * @return CoffeeFlavour
     */
    public static CoffeeFlavour intern(String name){
        synchronized (CACHE){
            return CACHE.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    /**
     * 当前缓存CACHE的大小
     * @return int
     */
    public static int flavoursInCache(){
        synchronized (CACHE){
            return CACHE.size();
        }
    }
}
