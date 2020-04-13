package com.xinchen.pattern.builder.inner;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/4/13 22:52
 */
public class Client {
    public static void main(String[] args) {
        final Computer computer = Computer
                .custom()
                .setCpu("I9")
                .setDisplay("DELL")
                .setRam("128G")
                .setKeyboard("LOGIC")
                .build();
        System.out.println(computer);
    }
}
