package com.xinchen.adapter.DefaultAdapter;

public class Girl {
	private String name;
	
	
	public String getName() {
		return name;
	}

	public Girl(String name){
		this.name = name;
		System.out.println("少女["+this.name+"]初长成");
	}
	
	public void Attribute(){
		System.out.println("少女["+this.getName()+"]属性：清音、柔体");
	}
}
