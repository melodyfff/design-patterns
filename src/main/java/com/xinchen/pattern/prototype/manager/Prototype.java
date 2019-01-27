package com.xinchen.pattern.prototype.manager;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/27 21:31
 */
public interface Prototype {
    /**
     * 自定义克隆（可使用第三方序列化方式）
     * @return Prototype
     */
    Prototype clone();

    /**
     * 标识
     * @return id
     */
    String id();
}
