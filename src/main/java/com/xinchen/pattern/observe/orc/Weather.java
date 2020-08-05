package com.xinchen.pattern.observe.orc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Observable 被观察者
 *
 * Weather can be observed by implementing {@link WeatherObserver} interface and registering as listener.
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:16
 */
class Weather {
    private static final Logger LOGGER = LoggerFactory.getLogger(Weather.class);

    /** maintain observers */
    private List<WeatherObserver> observers;
    private WeatherType currentWeather;

    public Weather() {
        // init
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }


    //----------------------------------
    // maintain observers add/remove
    //----------------------------------


    public void addObserver(WeatherObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(WeatherObserver obs) {
        observers.remove(obs);
    }

    /**
     * Makes time pass for weather
     */
    public void timePasses() {
        // 模拟时间流逝，天气变化
        // in real,do logic
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        LOGGER.info("The weather changed to {}.", currentWeather);

        // 通知观察者
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver obs : observers) {
            obs.update(currentWeather);
        }
    }
}
