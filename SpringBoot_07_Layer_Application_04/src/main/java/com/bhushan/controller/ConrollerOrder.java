package com.bhushan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhushan.sbeans.OrderBean;
import com.bhushan.service.ServiceOrder;

@Controller
public class ConrollerOrder {


	@Autowired
	private ServiceOrder service;   
	
	public void addData(OrderBean ord) {		
		try {
			int result = service.addOrderData(ord);
			if(result>0) {
				System.out.println("Order Placed successfully");
			}
			else {
				System.err.println("order is not placed");
			}
		} catch (Exception e) {
			System.out.println("Some Error comes in database "+e.getMessage());
		}	
	}
	
	public void delete(int orderId) {
		try {
			int result = service.deleteData(orderId);
			if(result>0) {
				System.out.println("Order cancel successfully");
			}
			else {
				System.err.println("order is not deleted");
			}
		} catch (Exception e) {
			System.out.println("Some Error comes in database "+e.getMessage());
		}
	}
	
	public void update(int orderId,double amount) {
	        try {
				int result = service.updateData(orderId, amount);
				if(result>0) {
					System.out.println("Order update successfully");
				}
				else {
					System.err.println("order is not update");
				}
			} catch (Exception e) {
				System.out.println("Some Error comes in database "+e.getMessage());
			}
	}
	
	public void retrive(){
		 try {
			List<OrderBean> list = service.retriveData();
			if(list!=null) {
				list.forEach(System.out::println);
			}
			else {
				System.out.println("Order is not in a list.");
			}
		 } catch (Exception e) {
			System.out.println("Some Error comes in database "+e.getMessage());
		 }
	}
}
