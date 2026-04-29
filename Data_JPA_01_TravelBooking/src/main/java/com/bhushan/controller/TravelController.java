package com.bhushan.controller;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhushan.entity.Travel;
import com.bhushan.service.ITravelService;
@Component
public class TravelController {

	@Autowired
	private ITravelService service;
	
	private Scanner sc = new Scanner(System.in);

    public void addTravel() {
        System.out.println("Enter Destination:");
        String dest = sc.nextLine();

        System.out.println("Enter Transportation Mode:");
        String mode = sc.nextLine();

        System.out.println("Enter Price:");
        Double price = sc.nextDouble();
        sc.nextLine();

        Travel travel = new Travel(dest, mode, price);
        service.addTravle(travel);

        System.out.println("Travel Booking Added!");
    }

    public void retrieveAllTravels() {
        Iterable<Travel> travels = service.getAllTravels();

        for (Travel t : travels) {
            System.out.println(t.getId() + " | " + t.getDestination() +
                    " | " + t.getTransportationMode() +
                    " | " + t.getPrice());
        }
    }

    public void findTravelById() {
        System.out.println("Enter ID:");
        Integer id = Integer.parseInt(sc.nextLine()); 

        Optional<Travel> travel = service.findTravelById(id);

        if (travel.isPresent()) {
            Travel t = travel.get();
            System.out.println(t.getId() + " | " + t.getDestination() +
                    " | " + t.getTransportationMode() +
                    " | " + t.getPrice());
        } else {
            System.out.println("Travel not found!");
        }
}
}