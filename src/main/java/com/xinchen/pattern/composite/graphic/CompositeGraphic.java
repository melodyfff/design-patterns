package com.xinchen.pattern.composite.graphic;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件 （Composite Role）
 * <p>
 * 该角色代表参加组合的、其下有分支的树枝对象，它的作用是将树枝和叶子组合成一个树形结构，
 * 并定义出管理子对象的方法，如add（）、remove（）等等。
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/26 23:30
 */
public class CompositeGraphic implements Graphic {

    /**
     * Collection of child graphics.
     */
    private List<Graphic> childGraphics = new ArrayList<>();

    /**
     * print the graphic
     */
    @Override
    public void print() {
        for (Graphic graphic : childGraphics){
            graphic.print();
        }
    }

    /**
     * Adds the graphic to the composition.
     *
     * @param graphic Graphic
     */
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    /**
     * Removes the graphic from the composition.
     *
     * @param graphic
     */
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }


}
