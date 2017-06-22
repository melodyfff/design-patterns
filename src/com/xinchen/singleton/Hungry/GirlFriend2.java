package com.xinchen.singleton.Hungry;

public class GirlFriend2 {
	private GirlFriend2() {
		System.out.println("女盆友被创建");
	}
	
	private static GirlFriend2 instance;
	
	static{
		instance = new GirlFriend2();
	}
	
	public static GirlFriend2 getInstance(){
		return instance;
	}
}
