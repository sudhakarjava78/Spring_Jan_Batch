package com.sudha;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		Account bean = (Account) context.getBean("account");
		bean.createAccount();
		bean.searchAccount();
		bean.updateAccount();
		bean.deleteAccount();
	}
}
