package com.xinchen.factory.AbstractFactory;

/**
 * 工厂实现类
 * @author Xin Chen
 *
 */
public class FactoryC implements Factory{

	@Override
	public Girl createGirl() {
		return new GirlC();
	}

	@Override
	public Goddess createGoddess() {
		return new GoddessC();
	}

}
