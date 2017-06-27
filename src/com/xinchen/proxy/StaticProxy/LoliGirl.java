package com.xinchen.proxy.StaticProxy;

public class LoliGirl implements Girl{
	
	private String name;
	
	public String getName(){
		return this.name;
	}
	
	public LoliGirl() {
		this.name = "小张";
		System.out.println("小萝莉["+name+"]产生");
	}
	public LoliGirl(String name) {
		this.name = name;
		System.out.println("小萝莉["+name+"]产生");
	}

	@Override
	public void makeEyesWithYou() {
		System.out.println("小萝莉["+name+"]向你抛了媚眼");
	}

	@Override
	public void DateWithYou() {
		System.out.println("小萝莉["+name+"]辛辛苦苦化妆打扮，不准备让你放假");
	}

}
