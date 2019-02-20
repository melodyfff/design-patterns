package com.xinchen.pattern.facade;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/17 23:00
 */
public class CPU {

    public void freeze(){
        System.out.println("CPU freeze...");
    }

    public void jump(long position){
        System.out.println("CPU jump to "+position);
    }

    public void execute(){
        System.out.println("CPU execute...");
    }
}