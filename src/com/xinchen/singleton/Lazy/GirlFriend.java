package com.xinchen.singleton.Lazy;
/**
 * 懒汉模式，线程不安全
 * @author xinchen
 *
 */
public class GirlFriend {
	private GirlFriend(){System.out.println("女朋友被创建---线程不安全");}
	
	private static GirlFriend girlFriend = null;
	
	public static GirlFriend getInstance(){
		if(girlFriend == null){
			girlFriend = new GirlFriend();
		}
		return girlFriend;
	}
	
	public void sayMonrning(){
		System.out.println("女朋友-"+this.hashCode()+" 向你說早安");
	}
}
