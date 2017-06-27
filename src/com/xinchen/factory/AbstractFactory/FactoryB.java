package com.xinchen.factory.AbstractFactory;

public class FactoryB implements Factory{

	@Override
	public Girl CreateGirl() {
		return new GirlB();
	}

	@Override
	public Goddess CreateGoddess() {
		return new GoddessB();
	}

}
