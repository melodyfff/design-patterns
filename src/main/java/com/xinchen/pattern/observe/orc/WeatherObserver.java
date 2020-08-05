package com.xinchen.pattern.observe.orc;

/**
 *
 * 观察者
 *
 * observer interface
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:15
 */
public interface WeatherObserver {
    void update(WeatherType currentWeather);
}
