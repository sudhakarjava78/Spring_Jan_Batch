package com.sudha;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WelcomeBean {

	private String message;
	private String name;

	public void init() {
		System.out.println("WelcomeBean Initalization");
	}

	public void destroy() {
		System.out.println("WelcomeBean Destruction");
	}
	
	public String welcome() {
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
