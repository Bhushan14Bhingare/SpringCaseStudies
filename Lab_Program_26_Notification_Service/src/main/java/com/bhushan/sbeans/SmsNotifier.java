package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotifier implements Notifier {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending SMS Notification: Your OTP is 4321.");
	}

}
