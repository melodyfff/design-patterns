package com.xinchen.singleton.Hungry;

public class AppMain {

	public static void main(String[] args) {
		GirlFriend gf = GirlFriend.getInstance();
		System.out.println(gf.hashCode());
		GirlFriend gf3 = GirlFriend.getInstance();
		System.out.println(gf3.hashCode());
		
		GirlFriend2 gf2 = GirlFriend2.getInstance();
		System.out.println(gf2.hashCode());
	}

}
