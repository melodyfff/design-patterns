package com.xinchen.adapter.DefaultAdapter;

public class Adapter extends BaseAdapter{
	private Girl girl;
	
	Adapter(Girl girl){
		super();
		this.girl = girl;
	}
	public void Attribute() {
		System.out.println("少女["+girl.getName()+"]属性：清音、柔体");
	}
	
	public void Posture(){
		System.out.println("少女["+ girl.getName()+"]遇到渣男，触发剧情");
		System.out.println("少女["+girl.getName()+"]解锁了新姿势，获得成就---[少女到少妇的转变]");
		System.out.println("少妇["+girl.getName()+"]产生");
	}
}
