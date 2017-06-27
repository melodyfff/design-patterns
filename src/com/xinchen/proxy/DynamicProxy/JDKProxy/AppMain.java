package com.xinchen.proxy.DynamicProxy.JDKProxy;

public class AppMain {

	public static void main(String[] args) {
		
		Girl girl = new GodGirl();
		
		LadyBro ladyBro = new LadyBro(girl);
		
		Girl ladyBroProxy = (Girl)ladyBro.getProxy();
		ladyBroProxy.makeEyesWithYou();
		ladyBroProxy.DateWithYou();
	}

}
