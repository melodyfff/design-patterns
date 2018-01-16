package com.xinchen.factory.AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 女孩实现类
 * @author Xin Chen
 *
 */
public class GirlC implements Girl{
	private final static Logger log = LoggerFactory.getLogger(GirlC.class);
	public GirlC() {
		log.info("创建女盆友-C");
	}
}
