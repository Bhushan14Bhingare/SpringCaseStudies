package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("whatsApp")
public class WhatsAppNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Notification sent successfully via WhatsApp:");
		System.out.println(message);
	}

}
