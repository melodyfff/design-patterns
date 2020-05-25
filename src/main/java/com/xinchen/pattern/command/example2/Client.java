package com.xinchen.pattern.command.example2;

/**
 *
 * 命令模式例子
 * https://howtodoinjava.com/design-patterns/behavioral/command-pattern/
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 11:16
 */
public class Client {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();    //receiver 1

        Fan livingRoomFan = new Fan();  //receiver 2

        Light bedRoomLight = new Light();   //receiver 3

        Fan bedRoomFan = new Fan();     //receiver 4

        HomeAutomationRemote remote = new HomeAutomationRemote();   //Invoker

        remote.setCommand(new CommandTurnOnLight( livingRoomLight ));
        remote.buttonPressed();

        remote.setCommand(new CommandTurnOnLight( bedRoomLight ));
        remote.buttonPressed();

        remote.setCommand(new CommandStartFan( livingRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new CommandStopFan( livingRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new CommandStartFan( bedRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new CommandStopFan( bedRoomFan ));
        remote.buttonPressed();
    }
}
