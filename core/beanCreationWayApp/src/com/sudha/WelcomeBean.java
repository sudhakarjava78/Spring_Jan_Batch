package com.sudha;

public class WelcomeBean {

	public void init() {
		System.out.println("User defined init() method");
	}

	public void destroy() {
		System.out.println("User defined destroy() method");
	}

	public String welcome() {
		return "Welcome to Spring Real Time";
	}
}
