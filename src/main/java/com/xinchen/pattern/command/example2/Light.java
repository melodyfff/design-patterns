package com.xinchen.pattern.command.example2;

/**
 * Light is a Receiver component in command pattern terminology.
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 11:07
 */
public class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}
