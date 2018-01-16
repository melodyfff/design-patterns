package com.xinchen.factory.AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 女神实现类
 *
 * @author Xin Chen
 */
public class GoddessC implements Goddess {
    private final static Logger log = LoggerFactory.getLogger(GirlB.class);

    public GoddessC() {
        log.info("创建女神-C");
    }
}
