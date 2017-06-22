package com.xinchen.singleton.Register;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册类名，下次直接获取
 * 
 * @author xinchen
 *
 */
public class GirlFriend {

	public GirlFriend() {
		System.out.println("女朋友被创建---" + this.hashCode());
	}

	private static Map<String, GirlFriend> map = new HashMap<String, GirlFriend>();

	static {
		GirlFriend girlFriend = new GirlFriend();
		map.put(girlFriend.getClass().getName(), girlFriend);
	}

	// 静态工厂方法,返还此类惟一的实例
	public static GirlFriend getInstance(String girlName) {
		if (girlName == null) {
			girlName = GirlFriend.class.getName();
		}
		if (map.get(girlName) == null) {
			try {
				map.put(girlName, (GirlFriend) Class.forName(girlName).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return map.get(girlName);
	}
	
	public void sayGoodNight(){
		System.out.println("女朋友向你说晚安~~~");
	}

}
