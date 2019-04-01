package com.xinchen.pattern.strategy;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/4/1 22:45
 */
@FunctionalInterface
public interface Strategy {

    /**
     * 获取价格
     * @param rawPrice 价格
     * @return 价格
     */
    int getPrice(int rawPrice);

    /**
     * 常规价格
     * @return rawPrice
     */
    static Strategy normalStrategy(){
        return rawPrice -> rawPrice;
    }

    /**
     * 打折价格
     * @return rawPrice / 2
     */
    static Strategy discountStrategy(){
        return rawPrice -> rawPrice / 2;
    }
}
