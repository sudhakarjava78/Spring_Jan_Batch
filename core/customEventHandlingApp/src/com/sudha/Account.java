package com.sudha;

public class Account {

	private AccountEventPublisher publisher;

	public void setPublisher(AccountEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void createAccount() {
		System.out.println("Account Created");
		publisher.publish("AccountCreated");
	}

	public void searchAccount() {
		System.out.println("Account Identified");
		publisher.publish("AccountIdentified");
	}

	public void updateAccount() {
		System.out.println("Account Updated");
		publisher.publish("AccountUpdated");
	}

	public void deleteAccount() {
		System.out.println("Account Deleted");
		publisher.publish("AccountDeleted");
	}

}
