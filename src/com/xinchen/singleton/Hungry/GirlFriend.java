package com.xinchen.singleton.Hungry;
/**
 * 饿汉式，在类初始化时已经自行实例化，线程安全
 * @author xinchen
 *
 */
public class GirlFriend {

	private GirlFriend() {
		System.out.println("女朋友被创建");
	}

	private static final GirlFriend GIRL_FRIEND = new GirlFriend();

	public static GirlFriend getInstance() {
		return GIRL_FRIEND;
	}
}
