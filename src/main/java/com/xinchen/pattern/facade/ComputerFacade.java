package com.xinchen.pattern.facade;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/17 23:05
 */
public class ComputerFacade {

    private final static long BOOT_ADDRESS = 0X000000;

    /** 磁盘地址 */
    private final static long BOOT_SECTOR = 0X0000c;
    /** 磁盘大小 */
    private final static int SECTOR_SIZE = 8225280;

    private final CPU processor;

    private final Memory ram;

    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        // cpu解冻
        processor.freeze();
        // 内存加载
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
