package com.xinchen.pattern.prototype.manager;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 22:04
 */
public class PrototypeManager {
    private static Map<String,Prototype> map = new ConcurrentHashMap();

    /** 防止外部初始化，保证只有一个实例 */
    private PrototypeManager() {}

    public static void addPrototype(Prototype prototype){
        map.put(prototype.id(), prototype);
    }

    public static void removePrototype(Prototype prototype){
        map.remove(prototype.id());
    }

    /**
     * 获取原始对象
     * @param id 标识
     * @return Prototype
     */
    public static Prototype getPrototype(String id){
        return map.get(id);
    }

    /**
     * 获取拷贝对象
     * @param id 标识
     * @return Prototype
     */
    public static Prototype getPrototypeClone(String id){
        return map.get(id).clone();
    }
}
