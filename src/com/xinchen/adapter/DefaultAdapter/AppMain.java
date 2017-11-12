package com.xinchen.adapter.DefaultAdapter;
/**
 * @author Xin Chen
 */
public class AppMain {

	public static void main(String[] args) {
		Woman woman = new Adapter(new Girl("小张"));
		woman.attribute();
		woman.posture();
	}

}
