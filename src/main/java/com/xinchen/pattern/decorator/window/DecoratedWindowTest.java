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
        // 1. 简单窗口
        final Window window = new SimpleWindow();

        // 2. 向简单窗口追加垂直滚动条
        final VerticalScrollBarDecorator verticalScrollBarDecorator = new VerticalScrollBarDecorator(window);

        // 3. 向垂直滚动条窗口添加水平滚动条
        final HorizontalScrollBarDecorator horizontalScrollBarDecorator = new HorizontalScrollBarDecorator(verticalScrollBarDecorator);

        // 4. 绘画最终窗口
        horizontalScrollBarDecorator.draw();

        // 5. 打印窗口描述
        System.out.println(horizontalScrollBarDecorator.getDescription());
        //  Draw simple window...
        //  Draw the vertical scrollbar...
        //  Draw the horizontal scrollbar...
        //  Simple Window, including vertical scrollbars, including horizontal scrollbars
    }
}
