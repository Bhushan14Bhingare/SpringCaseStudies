package com.bhushan.sbeans;


import org.springframework.stereotype.Component;

@Component

public final class FlightBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing Flight Booking");
		System.out.println("Booking completed Successfully");
	}

}
