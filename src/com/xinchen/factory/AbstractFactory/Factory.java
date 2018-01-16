package com.xinchen.factory.AbstractFactory;
/**
 * 抽象工厂接口
 * @author Xin Chen
 *
 */
public interface Factory {
	/**
	 * 创建女孩
	 * @return Girl
	 */
	Girl createGirl();
	/**
	 *	创建女神
	 * @return Girl
	 */
	Goddess createGoddess();
}
