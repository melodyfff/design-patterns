package com.xinchen.pattern.decorator.window;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:08
 */
public class SimpleWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Draw simple window...");
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
}
