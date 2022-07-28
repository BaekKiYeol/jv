package com.varxyz.test.mvc.Customer;

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
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>());
	}
	
	//로그인
	public Customer login(String userId) {
		String sql = "SELECT userId, passwd FROM Customer WHERE userId = ";
		try {
			return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>());
		}catch (EmptyResultDataAccessException e) {
			Customer result = new Customer();
			result.setUserId("로그인 실패");
			return result;
		}
	}
	
   
}