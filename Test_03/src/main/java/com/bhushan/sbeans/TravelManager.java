package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TravelManager {
   @Autowired
   @Qualifier("flightBooking")
   private BookingService bookingType;
   
   public void bookingDetails() {
	   System.out.println("Book Ticket : Flight");
	   bookingType.bookTicket();
   }
}
