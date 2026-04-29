package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class HotelBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing Hotel Booking");
		System.out.println("Booking completed Successfully");
	}

}
