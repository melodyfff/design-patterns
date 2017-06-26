package com.xinchen.adapter.ObjectAdapter;

public class Adapter implements Woman{

	private Girl girl;
	
	public Adapter(Girl girl){
		super();
		this.girl = girl;
	}
	
	@Override
	public void Attribute() {
		girl.Attribute();
	}

	@Override
	public void Posture() {
		System.out.println("少女["+ girl.getName()+"]遇到渣男，触发剧情");
		System.out.println("少女["+girl.getName()+"]解锁了新姿势，获得成就---[少女到少妇的转变]");
		System.out.println("少妇["+girl.getName()+"]产生");
	}

}
