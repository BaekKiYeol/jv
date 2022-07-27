package com.varxyz.test.mvc.Customer;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDao {
   private JdbcTemplate jdbcTemplate;
   
   public CustomerDao(DataSource dataSource) {
      jdbcTemplate = new JdbcTemplate(dataSource);
   }
   
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer (userId, email, passwd, name, ssn, phone)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		System.out.println(customer.getUserId());
		jdbcTemplate.update(sql, customer.getUserId(), customer.getEmail(), customer.getPasswd(), 
				customer.getName(), customer.getSsn(), customer.getPhone());
	}
   
}