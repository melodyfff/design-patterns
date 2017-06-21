package com.xinchen.factory.AbstractFactory;

public class FactoryC implements Factory{

	@Override
	public Girl CreateGirl() {
		return new GirlC();
	}

	@Override
	public Goddess CreateGoddess() {
		return new GoddessC();
	}

}
