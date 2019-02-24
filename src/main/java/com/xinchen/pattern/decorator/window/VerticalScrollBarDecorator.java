package com.xinchen.pattern.decorator.window;

/**
 * 垂直滚动条装饰器
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:20
 */
public class VerticalScrollBarDecorator extends WindowDecorator {

    public VerticalScrollBarDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawVerticalScrollBar();
    }

    /**
     * 绘制垂直滚动条
     */
    private void drawVerticalScrollBar(){
        // Draw the vertical scrollbar
        System.out.println("Draw the vertical scrollbar...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including vertical scrollbars";
    }
}
