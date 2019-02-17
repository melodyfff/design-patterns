package com.xinchen.pattern.facade;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/17 23:03
 */
public class HardDrive {

    public byte[] read(long lba, int size){
        System.out.println("HardDrive read "+lba+" size:"+size);
        return new byte[]{0X000000};
    }
}
