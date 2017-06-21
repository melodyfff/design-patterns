package com.xinchen.factory.AbstractFactory;
/**
 * 抽象工厂
 * @author Xin Chen
 *
 */
public class AppMain {

	public static void main(String[] args) {
		FactoryB fB = new FactoryB();
		fB.CreateGirl();
		fB.CreateGoddess();
		FactoryC fC = new FactoryC();
		fC.CreateGirl();
		fC.CreateGoddess();
		String s  = "1,2,3";
		s.split(",");
	}

}
