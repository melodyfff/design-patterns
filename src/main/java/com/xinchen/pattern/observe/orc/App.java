package com.xinchen.pattern.observe.orc;

import com.xinchen.pattern.observe.orc.generic.GHobbit;
import com.xinchen.pattern.observe.orc.generic.GOrc;
import com.xinchen.pattern.observe.orc.generic.GWeather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *  观察者模式是一种软件设计模式，其中一个对象称为主题，
 *  维护其依赖者（称为观察者）的列表，并自动通知他们任何状态更改，通常是通过调用其方法之一来进行的。
 *  它主要用于实现分布式事件处理系统。 观察者模式也是熟悉的关键部分模型-视图-控制器（MVC）架构模式。
 *  观察者模式在众多的编程库和系统，包括几乎所有的GUI工具包。
 * <p>
 *
 * 在此示例中，{@link Weather}的状态可以观察到。
 * {@link Orc}和{@link Hobbit}注册为观察者，并在{@link Weather}更改时接收通知。
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:26
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // 初始化被观察者
        Weather weather = new Weather();

        // 添加观察者
        weather.addObserver(new Orc());
        weather.addObserver(new Hobbit());

        // 模拟时间流逝天气变化
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // 抽象通用版本
        LOGGER.info("\n--Running generic version--");
        GWeather gWeather = new GWeather();
        gWeather.addObserver(new GOrc());
        gWeather.addObserver(new GHobbit());

        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
    }
}
