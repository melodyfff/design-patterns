package com.xinchen.pattern.builder.tradition;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/12 23:30
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(LogObjects.createDefault());

        final LogObject test = LogObjects.custom().setName("test").build();
        System.out.println(test.getName());

        LogObjects.custom()
                .setName("test2")
                .setContent("ok")
                .buildAndLog();
    }
}
