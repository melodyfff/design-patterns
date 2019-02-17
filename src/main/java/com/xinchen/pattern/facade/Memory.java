package com.xinchen.pattern.facade;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/17 23:02
 */
public class Memory {

    public void load(long position,byte[] data){
        System.out.println("Memory at "+ position+" load data :"+data);
    }
}
