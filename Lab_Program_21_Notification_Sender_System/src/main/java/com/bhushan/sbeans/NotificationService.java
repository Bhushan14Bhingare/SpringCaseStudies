package com.bhushan.sbeans;

public class NotificationService {
	
     private NotificationStrategy notificationStrategy;
     
     

	 public NotificationService(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}



	 public void notifyUser(String message) {
    	        notificationStrategy.send(message);
     }
}
