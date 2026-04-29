package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component("push")
public class PushNotifier implements Notifier {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending Push Notification: New offer available in your app!");
	}

}
