package com.xinchen.proxy.StaticProxy;

public class LadyBro implements Girl{
	private Girl girl;
	
	//默认小萝莉
	public LadyBro() {
		this.girl = new LoliGirl();
	}
	
	public LadyBro(Girl girl){
		this.girl = girl;
	}
	
	
	@Override
	public void makeEyesWithYou() {
		System.out.println("闺蜜中间搭桥");
		this.girl.makeEyesWithYou();
	}

	@Override
	public void DateWithYou() {
		System.out.println("闺蜜中间搭桥");
		this.girl.DateWithYou();
		
	}

}
