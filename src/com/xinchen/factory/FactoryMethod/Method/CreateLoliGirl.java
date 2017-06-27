package com.xinchen.factory.FactoryMethod.Method;

import com.xinchen.factory.FactoryMethod.Factory;
import com.xinchen.factory.FactoryMethod.Girl;
import com.xinchen.factory.FactoryMethod.LoliGirl;

public class CreateLoliGirl implements Factory{

	@Override
	public Girl create() {
		// TODO Auto-generated method stub
		return new LoliGirl();
	}

}
