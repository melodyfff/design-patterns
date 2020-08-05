package com.xinchen.pattern.observe.orc;

/**
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 10:14
 */
public enum  WeatherType {
    /** weather */
    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
