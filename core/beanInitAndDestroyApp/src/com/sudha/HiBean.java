package com.sudha;

public class HiBean {

	public static HiBean getInstance() {
		System.out.println("Static Factory Method");
		return new HiBean();
	}

	public String hiMsg() {
		return "Hi Spring app";
	}
}
