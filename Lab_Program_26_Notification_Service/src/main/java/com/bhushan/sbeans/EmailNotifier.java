package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotifier implements Notifier {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending Email Notification: Your order has been shipped!");
	}

}
