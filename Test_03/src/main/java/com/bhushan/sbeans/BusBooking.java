package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class BusBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing Bus Booking");
		System.out.println("Booking completed Successfully");
	}

}
