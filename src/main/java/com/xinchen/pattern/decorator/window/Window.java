package com.xinchen.pattern.decorator.window;

/**
 * 抽象构件(Component)
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:06
 */
public interface Window {
    /** Draws the window */
    void draw();

    /**
     * Returns a description of window
     * @return Description
     */
    String getDescription();
}
