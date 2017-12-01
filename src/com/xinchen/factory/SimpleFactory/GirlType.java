package com.xinchen.factory.SimpleFactory;

/**
 * @author Xin Chen
 * @date 2017/12/1 15:04
 */
public enum GirlType {
    //loli
    LOLIGIRL("LoliGirl"),
    //roya
    ROYALGIRL("RoyalGirl");

    private String type;

    GirlType(String type) {
        this.type = type;
    }

    /**
     * get type
     *
     * @return type
     */
    public String getType() {
        return this.type;
    }
}
