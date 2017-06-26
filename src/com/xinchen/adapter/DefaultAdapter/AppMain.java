package com.xinchen.adapter.DefaultAdapter;

public class AppMain {

	public static void main(String[] args) {
		Woman woman = new Adapter(new Girl("小张"));
		woman.Attribute();
		woman.Posture();
	}

}
