package com.xinchen.adapter.ObjectAdapter;
/**
 *  对象适配器的三个角色：
 *  	目标接口(Target)：客户所期待的接口，可以是具体的或抽象的类，也可以是接口
 *		需要适配的类(Adaptee)：需要适配的类或适配者类
 *		适配器(Adapter)：通过包装一个需要适配的对象，把原接口转换成目标接口
 * @author xinchen
 *
 */
public class AppMain {

	public static void main(String[] args) {
		Girl girl = new Girl("小露");
		Woman woman = new Adapter(girl);
		woman.Attribute();
		woman.Posture();
	}

}
