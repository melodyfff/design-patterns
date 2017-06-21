package com.xinchen.factory.FactoryMethod;

import com.xinchen.factory.FactoryMethod.Method.CreateLoliGirl;
import com.xinchen.factory.FactoryMethod.Method.CreateRoyalGirl;
/**
 * 工厂方法
 * @author Xin Chen
 *
 */
public class AppMain {
	public static void main(String[] args){
		CreateLoliGirl cLoliGirl = new CreateLoliGirl();
		cLoliGirl.create();
		CreateRoyalGirl royalGirl = new CreateRoyalGirl();
		royalGirl.create();
	}
}
