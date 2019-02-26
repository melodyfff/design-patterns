package com.xinchen.pattern.composite.graphic;

/**
 * 椭圆 叶子构件 （Leaf Role）
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/26 23:36
 */
public class Ellipse implements Graphic{
    @Override
    public void print() {
        System.out.println("Ellipse");
    }
}
