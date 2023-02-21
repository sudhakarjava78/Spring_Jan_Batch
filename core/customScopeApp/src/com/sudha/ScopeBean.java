package com.sudha;

public class ScopeBean {

	public ScopeBean() {
		System.out.println("ScopeBean Object is created");
	}
	
	public String sayHi() {
		return "Hello User Form"+Thread.currentThread().getName()+"Scope";
	}
}
