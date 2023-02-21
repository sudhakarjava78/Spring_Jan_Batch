package com.sudha;

import org.springframework.context.ApplicationListener;

public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	@Override
	public void onApplicationEvent(AccountEvent ae) {
		ae.generateLog();
	}

}
