package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class TrainBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing Train Booking");
		System.out.println("Booking completed Successfully");
	}

}
