package com.xinchen.pattern.composite.graphic;

/**
 * 抽象组件 Component Role
 *
 * 该角色定义参加组合的对象的共有方法和属性，规范一些默认的行为接口
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/26 23:29
 */
public interface Graphic {
    /** 打印图像 */
    void print();
}
