package com.xinchen.proxy.DynamicProxy.CglibProxy;

public class GodGirl{
	
	private String name;
	
	public String getName(){
		return this.name;
	}
	
	public GodGirl() {
		if(null==this.name){
			this.name = "小张";
		}
		System.out.println("女神出现");
	}
	
	public void makeEyesWithYou() {
		System.out.println("女神["+name+"]向你抛了媚眼");
	}

	public void DateWithYou() {
		System.out.println("女神["+name+"]辛辛苦苦化妆打扮，不准备让你放假");
	}

}
