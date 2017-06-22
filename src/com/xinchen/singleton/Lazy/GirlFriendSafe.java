package com.xinchen.singleton.Lazy;

/**
 * 懒汉模式，线程安全，最优方案
 * 
 * @author xinchen
 *
 */
public class GirlFriendSafe {
	private GirlFriendSafe() {
		System.out.println("女朋友被创建---线程安全");
	}

	// 双重检查锁定不是线程安全的，如果要用这种方式，需要使用volatile关键字。
	private static volatile GirlFriendSafe girlFriend;
	
	//如果只对此静态方法加锁，可能会造成重复初始化，造成效率低的情况
	public static synchronized GirlFriendSafe getInstance() {
		if (girlFriend == null) {
			synchronized (GirlFriendSafe.class) {
				if (girlFriend == null) {
					girlFriend = new GirlFriendSafe();
				}
			}

		}
		return girlFriend;
	}
}
