package com.bhushan.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhushan.sbeans.OrderBean;

@Repository
public class OrderDAO implements IOrderDAO
{

	@Autowired
	private DataSource ds;
	@Override
	public int insertData(OrderBean order) throws Exception {
		String query1 = "Insert into orders values(?,?,?,?)";
		int rowCount  = 0;
		
		try(Connection	conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query1)){
			ps.setInt(1, order.getOrderId());
			ps.setString(2,order.getOrderDate());
			ps.setString(3,order.getCustomerName());
			ps.setDouble(4,order.getTotalAmount());
			rowCount = ps.executeUpdate();
		}
		
		return rowCount;
	}

	@Override
	public int updateData(int orderId, double amount) throws Exception {
		String  query2 = "Update orders set totalAmount = ? where orderId = ?";
		
		int rowCount = 0 ;
		 try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query2)){
			 ps.setDouble(1,amount);
			 ps.setInt(2, orderId);
			 
			 rowCount = ps.executeUpdate();
		 }
		
		return rowCount;
	}

	@Override
	public int deleteData(int orderId) throws Exception {
		int rowCout = 0;
		String query3 = "Delete from orders where orderId = ?";
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query3)){
			ps.setInt(1,orderId);
			
			rowCout = ps.executeUpdate();
		}
		return rowCout;
	}

	@Override
	public List<OrderBean> retriveOrder() throws Exception {
		String query4 = "Select * from orders";
		List<OrderBean> list = new ArrayList<>();
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(query4)){
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				OrderBean ord = new OrderBean();
				
				ord.setOrderId(rs.getInt(1));
				ord.setOrderDate(rs.getString(2));
				ord.setCustomerName(rs.getString(3));
				ord.setTotalAmount(rs.getDouble(4));
			
				list.add(ord);
			}
		}
		return list;
	}

}
