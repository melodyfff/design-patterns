package com.xinchen.pattern.proxy.dynamic.cglib;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/13 23:10
 */
public class Subject {
    public String method(){
        System.out.println("Hello World!");
        return "ok";
    }
}
