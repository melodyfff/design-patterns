package com.xinchen.pattern.command.example2;

/**
 * Fan class is a Receiver component in command pattern terminology.
 *
 * @author xinchen
 * @version 1.0
 * @date 25/05/2020 11:08
 */
public class Fan {
    void start() {
        System.out.println("Fan Started..");

    }

    void stop() {
        System.out.println("Fan stopped..");
    }
}
