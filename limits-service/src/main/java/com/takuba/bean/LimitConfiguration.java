package com.takuba.bean;

public class LimitConfiguration {
	private int minimun;
	private int maximum;
	
	protected LimitConfiguration(){
		
	}
	public LimitConfiguration(int minimun, int maximum) {
		super();
		this.minimun = minimun;
		this.maximum = maximum;
	}
	public int getMinimun() {
		return minimun;
	}
	public int getMaximum() {
		return maximum;
	}
}
