package com.xinchen.pattern.decorator.window;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/24 19:53
 */
public class DecoratedWindowTestTest {
    @Test
    public void testWindowDecoratorTest() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        // assert that the description indeed includes horizontal + vertical scrollbars
        assertEquals("Simple Window, including vertical scrollbars, including horizontal scrollbars", decoratedWindow.getDescription());
    }
}