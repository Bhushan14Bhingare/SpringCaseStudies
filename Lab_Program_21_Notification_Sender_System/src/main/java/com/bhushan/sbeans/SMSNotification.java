package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Notification sent successfully via SMS:");
		System.out.println(message);
	}

}
