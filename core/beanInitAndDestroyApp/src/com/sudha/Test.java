package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		/*
		 * HelloBean hello = (HelloBean) ctx.getBean("hello"); HiBean hi = (HiBean)
		 * ctx.getBean("hi"); System.out.println(hello.syaHello());
		 * System.out.println(hi.hiMsg());
		 */

		/*
		 * WishBean wish= (WishBean) ctx.getBean("wish");
		 * System.out.println(wish.wishMsg());
		 */

		/*
		 * ProductBean bean2 = (ProductBean) ctx.getBean("product");
		 * System.out.println(bean2.getProductDetail()); ((AbstractApplicationContext)
		 * ctx).registerShutdownHook();
		 */

		Welcome bean = (Welcome) ctx.getBean("welcome");
		System.out.println(bean.sayWelcome());
		((AbstractApplicationContext)  ctx).registerShutdownHook();

	}
}
