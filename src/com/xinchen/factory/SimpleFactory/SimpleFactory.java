package com.xinchen.factory.SimpleFactory;

public class SimpleFactory {
	public static Girl factory(String type)throws Exception{
		if("LoliGirl".equals(type)){
			return new LoliGirl();
		}else if("RoyalGirl".equals(type)){
			return new RoyalGirl();
		}else{
			throw new Exception("Ã»ÓÐÃÃ×Ó");
		}
	}
}
