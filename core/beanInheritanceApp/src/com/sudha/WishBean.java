package com.sudha;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WishBean {

	private String message;
	private String name;

	public void init() {
		System.out.println("WishBean Initalization");
	}

	public void destroy() {
		System.out.println("WishBean Destruction");
	}
	
	public String wish() {
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
