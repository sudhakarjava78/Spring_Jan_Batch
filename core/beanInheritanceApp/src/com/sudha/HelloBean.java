package com.sudha;

public class HelloBean {

	private String message;
	private String name;

	public void init() {
		System.out.println("HelloBean Initalization");
	}

	public void destroy() {
		System.out.println("HelloBean Destruction");
	}

	public String hello() {
		return message + name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
