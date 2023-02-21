package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		WelcomeBean bean = (WelcomeBean)ctx.getBean(WelcomeBean.class);
		System.out.println(bean.welcome());
		
	}
}
