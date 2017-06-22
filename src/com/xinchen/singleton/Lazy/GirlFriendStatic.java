package com.xinchen.singleton.Lazy;

/**
 * 静态内部类 线程安全
 * 
 * @author xinchen
 *
 */
public class GirlFriendStatic {

	private GirlFriendStatic() {
		System.out.println("女朋友被創建");
	}

	private static class GirlFriendCreater {
		private static final GirlFriendStatic INSTANCE = new GirlFriendStatic();
	}

	public static final GirlFriendStatic getInstance() {
		return GirlFriendCreater.INSTANCE;
	}
}
