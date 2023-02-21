package com.sudha;

import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class AccountEvent extends ApplicationEvent {

	static FileOutputStream fos;

	static {
		try {
			fos = new FileOutputStream(
					"C:\\Users\\Sudhakar\\Work\\Spring_Jan_Batch\\customEventHandlingApp\\src\\com\\sudha\\cfg\\log.txt",
					true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String message;

	public AccountEvent(Object obj, String messgae) {
		super(obj);
		this.message = messgae;
	}

	public void generateLog() {
		try {
			message = new Date().toString() + ":" + message;
			message = message + "\n";
			byte[] b = message.getBytes();
			fos.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
