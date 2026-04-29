package com.bhushan.controller;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhushan.entity.FoodOrder;
import com.bhushan.service.IOrder;

@Component
public class OrderController {

	@Autowired
	private IOrder service;
	
	private Scanner sc = new Scanner(System.in);
	
	public void addOrder() {
		System.out.print("Enter a customer name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter a food item name : ");
		String itemName = sc.nextLine();
		
		System.out.println("Enter a item quantity : ");
		int quantity = Integer.parseInt(sc.nextLine());
		
	    System.out.println("Enter a item price : ");
	    Double price = Double.parseDouble(sc.nextLine());
	    
	    FoodOrder order = new FoodOrder(name,itemName,quantity,price);
	    
	    service.save(order);
	    
	    
	}
	
	public void addAllOrders() {
		System.out.println("Enter a no of orders: ");
		int orders = Integer.parseInt(sc.nextLine());
		
		ArrayList<FoodOrder> list = new ArrayList<>();
		
		for(int i = 0 ; i<orders; i++) {
			System.out.print("Enter a customer name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter a food item name : ");
			String itemName = sc.nextLine();
			
			System.out.println("Enter a item quantity : ");
			int quantity = Integer.parseInt(sc.nextLine());
			
		    System.out.println("Enter a item price : ");
		    Double price = Double.parseDouble(sc.nextLine());
		    
		    FoodOrder order = new FoodOrder(name,itemName,quantity,price);
		    list.add(order);
		}
		service.saveAll(list);		
	}
	
	public void findById(){
		System.out.println("Enter a order id : ");
		Long id = Long.parseLong(sc.nextLine());
		
		Optional<FoodOrder> orderDetails = service.findById(id);
		if(orderDetails.isPresent()) {
			FoodOrder order = orderDetails.get();
			calculateTotal(order);
			System.out.println(order.getId()+" | "+order.getCustomerName()+" | "+order.getFoodItem()+" | "+order.getQuantity()+" | "+order.getPricePerItem()+" | "+order.getTotalAmount());
			
		}
		else {
			System.out.println("Order id is not available.");
		}
	}
	
	public void findAllById() {
		System.out.println("Enter a no of search orders: ");
		int search = Integer.parseInt(sc.nextLine());
		
		ArrayList<Long> list = new ArrayList<>();
		
		for(int i = 0 ; i < search ; i++) {
			
			System.out.println("Enter a order id : ");
			Long id = Long.parseLong(sc.nextLine());
			list.add(id);
		}
		
		Iterable<FoodOrder> al = service.findAllById(list);
		for(FoodOrder order : al) {
			calculateTotal(order);
			System.out.println(order.getId()+" | "+order.getCustomerName()+" | "+order.getFoodItem()+" | "+order.getQuantity()+" | "+order.getPricePerItem()+" | "+order.getTotalAmount());
		}
	}
	
	public void viewAllOrders() {
		Iterable<FoodOrder> al = service.findAll();
		for(FoodOrder order : al) {
			calculateTotal(order);
			System.out.println(order.getId()+" | "+order.getCustomerName()+" | "+order.getFoodItem()+" | "+order.getQuantity()+" | "+order.getPricePerItem()+" | "+order.getTotalAmount());
		}
	}
	
	public void existById() {
		System.out.println("Enter a order id : ");
		Long id = Long.parseLong(sc.nextLine());
		boolean existsById = service.existsById(id);
		if(existsById){
			System.out.println("Order is available");
		}
		else {
			System.out.println("Order is not available.");
		}
	}
	
	public void countQuery() {
		long count = service.count();
		System.out.println(count);
	}
	
	public void deleteById() {
		System.out.println("Enter a order id : ");
		Long id = Long.parseLong(sc.nextLine());
		
		service.deleteById(id);
	}
	
	public void deleteAll() {
		service.deleteAll();
	}
	
	public void deleteByOrder() {
		System.out.print("Enter a customer name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter a food item name : ");
		String itemName = sc.nextLine();
		
		System.out.println("Enter a item quantity : ");
		int quantity = Integer.parseInt(sc.nextLine());
		
	    System.out.println("Enter a item price : ");
	    Double price = Double.parseDouble(sc.nextLine());
	    
	    FoodOrder order = new FoodOrder(name,itemName,quantity,price);
	    service.delete(order);
	}
	
	public void deleteByAllId() {
		
		System.out.println("Enter a no of search orders: ");
		int search = Integer.parseInt(sc.nextLine());
		
		ArrayList<Long> list = new ArrayList<>();
		
		for(int i = 0 ; i < search ; i++) {
			
			System.out.println("Enter a order id : ");
			Long id = Long.parseLong(sc.nextLine());
			list.add(id);
		}
		service.deleteAllById(list);
	}
	
	public void deleteByAllOrder() {
		System.out.println("Enter a no of orders: ");
		int orders = Integer.parseInt(sc.nextLine());
		
		ArrayList<FoodOrder> list = new ArrayList<>();
		
		for(int i = 0 ; i<orders; i++) {
			System.out.print("Enter a customer name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter a food item name : ");
			String itemName = sc.nextLine();
			
			System.out.println("Enter a item quantity : ");
			int quantity = Integer.parseInt(sc.nextLine());
			
		    System.out.println("Enter a item price : ");
		    Double price = Double.parseDouble(sc.nextLine());
		    
		    FoodOrder order = new FoodOrder(name,itemName,quantity,price);
		    list.add(order);
		}
		service.deleteAll(list);
	}
	
	public double calculateTotal(FoodOrder item){
	    double total = 0;
	   
	        total += item.getPricePerItem() * item.getQuantity();
	    item.setTotalAmount(total);
	    return item.getTotalAmount();
	}
}
