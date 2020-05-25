package com.xinchen.pattern.command.example2;

/**
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 11:12
 */
public class CommandStopFan implements Command {
    private Fan fan;

    public CommandStopFan(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("stopping Fan.");
        fan.stop();
    }
}
