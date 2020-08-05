package com.xinchen.pattern.observe.orc.generic;

import com.xinchen.pattern.observe.orc.WeatherType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:38
 */
public class GOrc implements Race {
    private static final Logger LOGGER = LoggerFactory.getLogger(GOrc.class);

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        switch (weatherType) {
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
