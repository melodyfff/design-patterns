package com.xinchen.adapter.ClassAdapter;
/**
 * 类的适配模式
 * @author xinchen
 *
 */
public class Adapter extends Girl implements Woman {

	public Adapter(String name) {
		super(name);
	}

	@Override
	public void growing() {
		System.out.println("少女["+ this.getName()+"]遇到渣男，触发剧情");
		System.out.println("少女["+this.getName()+"]解锁了新姿势，获得成就---[少女到少妇的转变]");
		System.out.println("少妇["+this.getName()+"]产生");
	}

}
