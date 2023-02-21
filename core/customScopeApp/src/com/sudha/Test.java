package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		ScopeBean bean1 = (ScopeBean) context.getBean("custom");
		ScopeBean bean2 = (ScopeBean) context.getBean("custom");
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1.sayHi());
		System.out.println(bean2.sayHi());
		System.out.println(bean1 == bean2);
		System.out.println();
		ThreadScope threadScope = (ThreadScope) context.getBean("threadScope");
		ScopeBean bean3 = (ScopeBean) threadScope.remove("custom");
		System.out.println(bean3);
		System.out.println();
		ScopeBean bean4 = (ScopeBean) context.getBean("custom");
		ScopeBean bean5 = (ScopeBean) context.getBean("custom");
		System.out.println(bean4);
		System.out.println(bean5);
		System.out.println(bean4.sayHi());
		System.out.println(bean5.sayHi());
		System.out.println(bean4 == bean5);
	}
}
