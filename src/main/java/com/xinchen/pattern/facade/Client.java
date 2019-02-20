package com.xinchen.pattern.facade;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/17 23:15
 */
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        // CPU freeze...
        // HardDrive read 12 size:8225280
        // Memory at 0 load data :[B@2b193f2d
        // CPU jump to 0
        // CPU execute...
    }
}
