package com.sudha;

public class HiBean {

	static {
		System.out.println("Bean Loading........");
	}
	
	public HiBean() {
		System.out.println("Bean Created......");
	}
	
	public String sayHi() {
		return "Hi Spring App";
	}
}
