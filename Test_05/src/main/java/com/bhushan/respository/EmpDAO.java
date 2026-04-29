package com.bhushan.respository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhushan.bean.Employee;

@Repository
public class EmpDAO implements IEmpDAO {
	
	public final static String insert = "Insert into Employee values(?,?,?,?)";
	public final static String retrive = "Select * from employee";
	public final static String delete = "Delete  from employee where id = ?";
	
	public final static String update = "Update Employee set  salary = ? where id = ?";
	
	
	
	@Autowired
	private DataSource ds;

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		int rowCount = 0;
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(insert)){
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getAge());
			ps.setDouble(4, emp.getSalary());
			
			rowCount = ps.executeUpdate();
		}
		catch(Exception e) {
			throw e;
		}
		return rowCount;
	}

	@Override
	public List<Employee> retriveAllEmployee() throws Exception {
		List<Employee> list = new ArrayList<>();
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(retrive)){
		  ResultSet rs =   ps.executeQuery();
		  while(rs.next()) {
			  Employee emp = new Employee();
			  emp.setId(rs.getInt(1));
			  emp.setName(rs.getString(2));
			  emp.setAge(rs.getInt(3));
			  emp.setSalary(rs.getDouble(4));
			  list.add(emp);
		  }
		}
		return list;
	}

	@Override
	public int deleteEmployee(int id) throws Exception {
int rowCount = 0;
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(delete)){
			ps.setInt(1, id);
						
			rowCount = ps.executeUpdate();
		}
		catch(Exception e) {
			throw e;
		}
		return rowCount;
	}

	@Override
	public int updateEmployee(int id, double salary) throws Exception {
int rowCount = 0;
		
		try(Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(update)){
			ps.setInt(2, id);
			
			ps.setDouble(1, salary);
			
			rowCount = ps.executeUpdate();
		}
		catch(Exception e) {
			throw e;
		}
		return rowCount;
	}

}
