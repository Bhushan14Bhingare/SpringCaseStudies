package com.bhushan.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class NotificationFactory {
     @Autowired
	private Map<String,Notifier> notification;
     
     public Notifier getNotifier(String type) {
    	  return notification.get(type);
     }
}
