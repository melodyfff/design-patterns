package com.xinchen.pattern.command.example2;

/**
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 11:10
 */
public class CommandTurnOnLight implements Command {
    private Light light;

    public CommandTurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}
