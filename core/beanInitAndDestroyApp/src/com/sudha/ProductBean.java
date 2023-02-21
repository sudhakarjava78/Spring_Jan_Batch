package com.sudha;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProductBean implements InitializingBean, DisposableBean {

	private String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
		System.out.println("setPname()");
	}

	public String getProductDetail() {
		return pname;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		pname = "Mobile";
		System.out.println("afterPropertiesSet()");
	}

}
