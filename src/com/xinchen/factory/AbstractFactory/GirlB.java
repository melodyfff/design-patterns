package com.xinchen.factory.AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 女孩实现类
 *
 * @author Xin Chen
 */
public class GirlB implements Girl{

	private final static Logger log = LoggerFactory.getLogger(GirlB.class);

	public GirlB() {
		log.info("创建女盆友-B");
	}
}
