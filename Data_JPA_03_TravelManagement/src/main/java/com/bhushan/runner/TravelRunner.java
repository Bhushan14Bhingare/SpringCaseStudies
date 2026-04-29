package com.bhushan.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhushan.controller.BookingController;
@Component
public class TravelRunner implements CommandLineRunner {

	@Autowired
	private BookingController controller;
	@Override
	public void run(String... args) throws Exception {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.Add a new travel booking.\r\n"
					+ "2.Retrieve all travel bookings.\r\n"
					+ "3.Find a travel booking by ID.\r\n"
					+ "4.Delete a travel booking by ID.\r\n"
					+ "5.Check if a travel booking exists.\r\n"
					+ "6.Count total travel bookings.\r\n"
					+ "7.Delete a specific travel booking.\r\n"
					+ "8.Delete all travel bookings.\r\n"
					+ "9.Exit.");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 -> controller.addTravel();
			case 2 -> controller.fetchAllBooking();
			case 3 -> controller.fetchById();
			case 4 -> controller.deleteById();
			case 5 -> controller.isExist();
			case 6 -> controller.countBooking();			
			case 7 -> controller.deleteByObject();
			case 8 -> controller.deleteAllRecord();
			case 9 -> System.out.println("Exit....");
			default -> System.out.println("Invalid Choice.");
			}
			
		}while(choice!= 9);
		sc.close();
	}

}
