package com.xinchen.factory.SimpleFactory;
/**
 * ¼òµ¥¹¤³§
 * @author Xin Chen
 *
 */
public class AppMain {
	public static void main(String[] args){
		try {
			SimpleFactory.factory("LoliGirl");
			SimpleFactory.factory("RoyalGirl");
			SimpleFactory.factory("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
