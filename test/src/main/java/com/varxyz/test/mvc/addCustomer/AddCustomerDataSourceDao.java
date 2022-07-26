package com.varxyz.test.mvc.addCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.test.mvc.DataSourceConfig;
import com.varxyz.test.mvc.Customer.Customer;

public class AddCustomerDataSourceDao {
	private DataSource dataSource;
	
	public AddCustomerDataSourceDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer (email, passwd, name, ssn, phone)"
				+ " VALUES (?, ?, ?, ?, ?)";
		
		try(Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, customer.getEmail());
			pstmt.setString(2, customer.getPasswd());
			pstmt.setString(3, customer.getName());
			pstmt.setString(4, customer.getSsn());
			pstmt.setString(5, customer.getPhone());
			
			pstmt.executeUpdate();
			con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		AddCustomerDataSourceDao dao = 
				context.getBean("addCustomerDataSourceDao", AddCustomerDataSourceDao.class);
		Customer c = new Customer();
		c.setEmail("yubi@java.com");
		c.setPasswd("1234");
		c.setName("유비");
		c.setSsn("880808-1234567");
		c.setPhone("010-1234-1234");
		dao.addCustomer(c);
		System.out.println("-inserted-");
		context.close();
	}
}
