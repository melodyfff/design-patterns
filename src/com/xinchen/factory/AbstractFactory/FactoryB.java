package com.xinchen.factory.AbstractFactory;
/**
 * 工厂实现类
 * @author Xin Chen
 *
 */
public class FactoryB implements Factory{

	@Override
	public Girl createGirl() {
		return new GirlB();
	}

	@Override
	public Goddess createGoddess() {
		return new GoddessB();
	}

}
