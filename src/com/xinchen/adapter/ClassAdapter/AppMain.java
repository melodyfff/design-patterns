package com.xinchen.adapter.ClassAdapter;
/**
 *  类适配器的三个角色：
 *  	目标接口(Target)：客户所期待的接口，目标是接口
 *		需要适配的类(Adaptee)：需要适配的类或适配者类
 *		适配器(Adapter)：实现了抽象目标类接口Target，并继承了适配者类Adaptee
 *  @author xinchen
 *
 */
public class AppMain {

	public static void main(String[] args) {
		Woman girl = new Adapter("小张");
		girl.Attribute();
		girl.Posture();
	}

}
