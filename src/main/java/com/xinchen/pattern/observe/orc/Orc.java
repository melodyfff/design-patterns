package com.xinchen.pattern.observe.orc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 兽人观察者
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:23
 */
class Orc implements WeatherObserver{
    private static final Logger LOGGER = LoggerFactory.getLogger(Orc.class);

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                LOGGER.info("The orcs are freezing cold.");
                break;
            case RAINY:
                LOGGER.info("The orcs are dripping wet.");
                break;
            case SUNNY:
                LOGGER.info("The sun hurts the orcs' eyes.");
                break;
            case WINDY:
                LOGGER.info("The orc smell almost vanishes in the wind.");
                break;
            default:
                break;
        }
    }
}
