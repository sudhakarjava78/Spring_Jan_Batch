package com.sudha;

public class HelloBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String helloBean() {
		return "Hello User"+name;
	}

}
