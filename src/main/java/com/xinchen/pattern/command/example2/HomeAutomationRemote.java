package com.xinchen.pattern.command.example2;

/**
 *
 * Remote Control for Home automation where it will accept the command and execute.
 *
 * This is the invoker in terms of command pattern terminology
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 11:13
 */
public class HomeAutomationRemote {
    // Command Holder
    private Command command;

    // //Set the command in runtime to trigger.
    public void setCommand(Command command) {
        this.command = command;
    }

    // Will call the command interface method so that particular command can be invoked.
    public void buttonPressed(){
        command.execute();
    }
}
