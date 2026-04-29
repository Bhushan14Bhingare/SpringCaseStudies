package com.bhushan.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bhushan.controller.OrderController;

@Component
public class FoodOrderRunner implements CommandLineRunner {

    
	@Autowired
	private OrderController contoller;

    

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int choice;
        do {
        	System.out.println("1. Add Order\n"
        			+ "2. Add Multiple Orders\n"
        			+ "3. View All Orders\n"
        			+ "4. View Orders by IDs\n"
        			+ "5. Find Order by ID\n"
        			+ "6. Check Order Exists\n"
        			+ "7. Count Orders\n"
        			+ "8. Delete Order by ID\n"
        			+ "9. Delete Orders by IDs\n"
        			+ "10. Delete Specific Order\n"
        			+ "11. Delete Selected Orders\n"
        			+ "12. Delete All Orders\n"
        			+ "13. Exit\n");
        	choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1 -> contoller.addOrder();
        	
        	case 2 -> contoller.addAllOrders();
        	
        	case 3 -> contoller.viewAllOrders();
        	
        	case 4 -> contoller.findAllById();
        	
        	case 5 -> contoller.findById();
        	
        	case 6 -> contoller.existById();
        	
        	case 7 -> contoller.countQuery();
        	
        	case 8 -> contoller.deleteById();
        	
        	case 9 -> contoller.deleteByAllId();
        	
        	case 10 -> contoller.deleteByOrder();
        	
        	case 11 -> contoller.deleteByAllOrder();
        	
        	case 12 -> contoller.deleteAll();
        	
        	case 13 -> System.out.println("Existing......");
        	
        	default -> System.out.println("Invalid choice!");
        	}
        }
        while(choice!=13);
        sc.close();
        
	}

}
