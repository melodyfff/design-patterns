package com.xinchen.factory.SimpleFactory;

public class SimpleFactory {
	public static Girl factory(String type)throws Exception{
		if(GirlType.LOLIGIRL.getType().equals(type)){
			return new LoliGirl();
		}else if(GirlType.ROYALGIRL.getType().equals(type)){
			return new RoyalGirl();
		}else{
			throw new Exception("没有女盆友");
		}
	}
}
