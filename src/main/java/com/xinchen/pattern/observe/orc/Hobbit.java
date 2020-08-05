package com.xinchen.pattern.observe.orc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 霍比特人观察者
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:25
 */
public class Hobbit implements WeatherObserver{

    private static final Logger LOGGER = LoggerFactory.getLogger(Hobbit.class);

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                LOGGER.info("The hobbits are shivering in the cold weather.");
                break;
            case RAINY:
                LOGGER.info("The hobbits look for cover from the rain.");
                break;
            case SUNNY:
                LOGGER.info("The happy hobbits bade in the warm sun.");
                break;
            case WINDY:
                LOGGER.info("The hobbits hold their hats tightly in the windy weather.");
                break;
            default:
                break;
        }
    }
}
