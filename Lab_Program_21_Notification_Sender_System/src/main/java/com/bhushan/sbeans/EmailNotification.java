package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Notification sent successfully via Email: ");
		System.out.println(message);
	}

}
