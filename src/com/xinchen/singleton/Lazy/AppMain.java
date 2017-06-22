package com.xinchen.singleton.Lazy;
/**
 * 单例子懒汉模式，避免类在外部被实例化
 * 线程不安全，在多线程的情况下不能正常使用
 * @author xinchen
 *
 */
public class AppMain {

	public static void main(String[] args) {
		//懒汉单例线程不安全
		GirlFriend gf = GirlFriend.getInstance();
		GirlFriend gf2 = GirlFriend.getInstance();
		
		System.out.println(gf.hashCode());
		System.out.println(gf2.hashCode());
		
		gf.sayMonrning();
		gf2.sayMonrning();
		
	}
}
