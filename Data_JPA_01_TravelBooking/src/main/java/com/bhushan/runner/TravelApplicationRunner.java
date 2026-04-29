package com.bhushan.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhushan.controller.TravelController;
@Component
public class TravelApplicationRunner implements CommandLineRunner {

	@Autowired
    private TravelController controller;

    @Override
    public void run(String... args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Travel");
            System.out.println("2. View All Travels");
            System.out.println("3. Find Travel by ID");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    controller.addTravel();
                    break;
                case 2:
                    controller.retrieveAllTravels();
                    break;
                case 3:
                    controller.findTravelById();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }

}
