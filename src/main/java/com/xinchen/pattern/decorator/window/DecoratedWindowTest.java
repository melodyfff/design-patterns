package com.xinchen.pattern.decorator.window;

/**
 * 客户端
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:33
 */
public class DecoratedWindowTest {
    public static void main(String[] args) {
        // 装饰器动态追加功能
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));

        decoratedWindow.draw();

        System.out.println(decoratedWindow.getDescription());
        //  Draw simple window...
        //  Draw the vertical scrollbar...
        //  Draw the horizontal scrollbar...
        //  Simple Window, including vertical scrollbars, including horizontal scrollbars
    }
}
