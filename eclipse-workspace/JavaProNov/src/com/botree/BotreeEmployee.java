package com.botree;

public class BotreeEmployee extends Employee {
	
	public BotreeEmployee() {
		super();
	}
	
	public BotreeEmployee(int i, String n,int s) {
		super(i);
		
		this.name=n;
		this.salary=s;
	}
	
	public void showDetail() {
		System.out.println(this.name+"  "+this.salary+"  "+this.getId());
	}
	
	

}
