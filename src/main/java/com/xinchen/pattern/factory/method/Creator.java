package com.xinchen.pattern.factory.method;

/**
 * @author xinchen
 * @version 1.0
 * @date 19/01/2019 17:02
 */
public abstract class Creator {
    /**
     * 创建一个产品对象
     * @param cls 产品具体类
     * @param <T>  产品类型 设置为Product的子类
     * @return <T extends Product>
     */
    public abstract <T extends Product> T createProduct(Class<T> cls);
}
