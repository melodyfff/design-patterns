package com.xinchen.factory.AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 女神实现类
 * @author Xin Chen
 *
 */
public class GoddessB implements Goddess{
	private final static Logger log = LoggerFactory.getLogger(GirlB.class);
	public GoddessB() {
		log.info("创建女神-B");
	}
}
