package com.xinchen.pattern.observe.orc.generic;

import com.xinchen.pattern.observe.orc.WeatherType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:38
 */
public class GHobbit implements Race {
    private static final Logger LOGGER = LoggerFactory.getLogger(GHobbit.class);

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        switch (weatherType) {
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
