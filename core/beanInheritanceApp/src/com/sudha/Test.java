package com.sudha;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		HelloBean hello = (HelloBean) context.getBean("hello");
		System.out.println(hello.hello());
		System.out.println();
		WelcomeBean welcome = (WelcomeBean) context.getBean("welcome");
		System.out.println(welcome.welcome());
		context.registerShutdownHook();
	}
}
