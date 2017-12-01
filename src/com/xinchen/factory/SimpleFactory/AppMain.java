package com.xinchen.factory.SimpleFactory;
/**
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
			e.printStackTrace();
		}
	}
}
