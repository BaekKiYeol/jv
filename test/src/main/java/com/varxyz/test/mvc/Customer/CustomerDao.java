package com.varxyz.test.mvc.Customer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDao {
   private JdbcTemplate jdbcTemplate;
   
   public CustomerDao(DataSource dataSource) {
      jdbcTemplate = new JdbcTemplate(dataSource);
   }
   
   	//가입
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer (userId, email, passwd, name, ssn, phone)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		System.out.println(customer.getUserId());
		jdbcTemplate.update(sql, customer.getUserId(), customer.getEmail(), customer.getPasswd(), 
				customer.getName(), customer.getSsn(), customer.getPhone());
	}
	
	//조회
	public Customer checkAccount(String accountNum) {
		String sql = "SELECT c.passwd FROM Customer c INNER JOIN "
				+ " Account a on c.userId = a.userId WHERE a.accountNum = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(), accountNum);
	}
	
	//로그인
//	public boolean login(String userId, String passwd) {
//		String sql = "SELECT userId, passwd FROM Customer WHERE userId = ?";
//		Customer customer = new Customer();
//		customer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(), userId);
//		
//		if(userId == customer.getUserId() && passwd == customer.getPasswd()) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	public Customer login(String userId, String passwd) {
		String sql = "SELECT userId, passwd FROM Customer WHERE userId = ?";
		Customer result = new Customer();
		
		try {
			return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(), userId);
		} catch(EmptyResultDataAccessException e) {
			return result;
		}
	}
}















