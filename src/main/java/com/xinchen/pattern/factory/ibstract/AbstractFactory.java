package com.xinchen.pattern.factory.ibstract;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 18:15
 */
public interface AbstractFactory {
    /**
     * 创建产品A
     * @param cls 具体产品类
     * @param <T> 具体产品类
     * @return 具体产品类A
     */
    <T extends ProductA> T createProductA(Class<T> cls);
    /**
     * 创建产品B
     * @param cls 具体产品类
     * @param <T> 具体产品类
     * @return 具体产品类AB
     */
    <T extends ProductB> T createProductB(Class<T> cls);
}
