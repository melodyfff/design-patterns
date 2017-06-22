package com.xinchen.singleton.Register;

public class AppMain {

	public static void main(String[] args) {
		GirlFriend gf = GirlFriend.getInstance(null);
		gf.sayGoodNight();
		GirlFriend gf2 = GirlFriend.getInstance(null);
		gf2.sayGoodNight();
//		GirlFriend gf3 = GirlFriend.getInstance("test");
//		gf3.sayGoodNight();
	}

}
