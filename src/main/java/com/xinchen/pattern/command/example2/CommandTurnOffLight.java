package com.xinchen.pattern.command.example2;

/**
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 11:09
 */
public class CommandTurnOffLight implements Command {
    private Light light;

    public CommandTurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}
