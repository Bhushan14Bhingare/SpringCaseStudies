package com.bhushan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.repository.OrderDAO;
import com.bhushan.sbeans.OrderBean;

@Service
public class ServiceOrder {

	@Autowired
	private OrderDAO order;
	
	public int addOrderData(OrderBean orderBean) throws Exception {
		return order.insertData(orderBean);
	}
	
	public int updateData(int orderId, double amount) throws Exception{
		return order.updateData(orderId, amount);
	}
	
	public int deleteData(int orderId) throws Exception{
		return order.deleteData(orderId);
	}
	
	public List<OrderBean> retriveData() throws Exception{
		return order.retriveOrder();		
	}
}
