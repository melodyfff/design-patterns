package com.xinchen.proxy.DynamicProxy.CglibProxy;

public class AppMain {

	public static void main(String[] args) {
		LadyBro ladyBro = new LadyBro();
		GodGirl ladyBroProxy = (GodGirl) ladyBro.getInstance(new GodGirl());
		ladyBroProxy.makeEyesWithYou();
		ladyBroProxy.DateWithYou();
	}

}
