package com.bhushan.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhushan.entity.Travel;
import com.bhushan.service.ITravelService;

@Component
public class BookingController {

	@Autowired
	private ITravelService service;

    private Scanner sc = new Scanner(System.in);
   
	
	public void addTravel() {
		
		Travel travel = new Travel();
				
		System.out.println("Enter a customer destination : ");
		String destination = sc.nextLine();
		travel.setDestination(destination);
		
		System.out.println("Enter a customer Transportation mode : ");
		String modeOfTravel = sc.nextLine();
		travel.setTransportationMode(modeOfTravel);
		
		System.out.println("Enter a customer fair charge : ");
		Double charge = Double.parseDouble(sc.nextLine());
		travel.setPrice(charge);	
		
		service.addTravel(travel);
	}
	
	public void fetchAllBooking() {		
		Iterable<Travel> allTravels = service.retrieveAllTravels();
		allTravels.forEach(System.out::println);		
	}
	
	public void fetchById() {		
		System.out.println("Enter a booking id : ");
		Long id = Long.parseLong(sc.nextLine());
		service.findTravelById(id);
	}
	
	public void deleteById() {
		System.out.println("Enter a booking id : ");
		Long id = Long.parseLong(sc.nextLine());
		service.deleteTravelById(id);
	}
	
	public void isExist() {
		System.out.println("Enter a booking id : ");
		Long id = Long.parseLong(sc.nextLine());
		boolean isAvailabe = service.checkIfTravelExists(id);
		if(isAvailabe) {
			System.out.println("Booking is Available");
		}
		else {
			System.out.println("Booking is not Available");
		}
	}
	
	public void deleteByObject() {
		
		Travel travel = new Travel();
		
		System.out.println("Enter a booking id : ");
		Long id = Long.parseLong(sc.nextLine());
		travel.setId(id);
		
		System.out.println("Enter a customer destination : ");
		String destination = sc.nextLine();
		travel.setDestination(destination);
		
		System.out.println("Enter a customer Transportation mode : ");
		String modeOfTravel = sc.nextLine();
		travel.setTransportationMode(modeOfTravel);
		
		System.out.println("Enter a customer fair charge : ");
		Double charge = Double.parseDouble(sc.nextLine());
		travel.setPrice(charge);	
		
		service.deleteTravelObject(travel);
	}
	
	public void countBooking() {
		long count = service.countTravels();		
		System.out.println("Total Booking is : "+count);
	}
	
	public void deleteAllRecord() {
		service.deleteAllTravel();
	}
	
}
