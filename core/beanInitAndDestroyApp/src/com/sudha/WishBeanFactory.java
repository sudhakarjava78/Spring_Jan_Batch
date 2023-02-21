package com.sudha;

public class WishBeanFactory {

	public WishBean getBeanInstance() {
		System.out.println("Instance Factory MEthod");
		return new WishBean();
	}
}
