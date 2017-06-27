package com.xinchen.proxy;

public class LoliGirl implements Girl{
	
	public LoliGirl() {
		System.out.println("小萝莉产生");
	}

	@Override
	public void makeEyesWithYou() {
		System.out.println("小萝莉向你抛了媚眼");
	}

	@Override
	public void DateWithYou() {
		System.out.println("小萝莉辛辛苦苦化妆打扮，不准备让你放假");
	}

}
