package com.xinchen.pattern.decorator.window;

/**
 * 水平滚动条装饰器
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:28
 */
public class HorizontalScrollBarDecorator extends WindowDecorator{

    public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawHorizontalScrollBar();
    }

    /**
     * 绘制水平滚动条
     */
    private void drawHorizontalScrollBar() {
        // Draw the horizontal scrollbar
        System.out.println("Draw the horizontal scrollbar...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including horizontal scrollbars";
    }
}
