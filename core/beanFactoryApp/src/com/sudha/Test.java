package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		HiBean bean = (HiBean) context.getBean("hi");
		System.out.println(bean.sayHi());
	}
}
