package com.xinchen.pattern.decorator.window;

/**
 * 窗口装饰器Decorator
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:11
 */
public abstract class WindowDecorator implements Window{

    /** 被装饰的类 */
    protected Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public void draw() {
        // 被装饰对象执行方法
        windowToBeDecorated.draw();
    }

    @Override
    public String getDescription() {
        // 被装饰对象执行方法
        return windowToBeDecorated.getDescription();
    }
}
