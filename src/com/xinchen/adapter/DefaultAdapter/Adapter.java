package com.xinchen.adapter.DefaultAdapter;
/**
 * @author Xin Chen
 */
public class Adapter extends BaseAdapter{
	private Girl girl;
	
	Adapter(Girl girl){
		super();
		this.girl = girl;
	}
	@Override
	public void attribute() {
		System.out.println("少女["+girl.getName()+"]属性：清音、柔体");
	}
	
	@Override
	public void posture(){
		System.out.println("少女["+ girl.getName()+"]遇到渣男，触发剧情");
		System.out.println("少女["+girl.getName()+"]解锁了新姿势，获得成就---[少女到少妇的转变]");
		System.out.println("少妇["+girl.getName()+"]产生");
	}
}
