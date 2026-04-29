package com.bhushan.repository;

import java.util.List;

import com.bhushan.sbeans.OrderBean;

public interface IOrderDAO {

	int insertData(OrderBean order) throws Exception;
	int updateData(int orderId,double amount) throws Exception;
	int deleteData(int orderId) throws Exception ;
	List<OrderBean> retriveOrder() throws Exception;
}
