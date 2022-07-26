package com.varxyz.test.mvc.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDao {
   private JdbcTemplate jdbcTemplate;
   
   public CustomerDao(DataSource dataSource) {
      jdbcTemplate = new JdbcTemplate(dataSource);
   }
   
   //전체 조회
   public List<Customer> findAllCustomers(){
      String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer";
      
      return jdbcTemplate.query(sql, new RowMapper<Customer>() {

         @Override
         public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer(rs.getLong("cid"), rs.getString("email"), 
                      rs.getString("name"), rs.getString("passwd"), rs.getString("ssn"), 
                      rs.getString("phone"), rs.getDate("regDate"));
            return customer;
         }
         
      });
   }
   
   //날짜로 조회 
   public List<Customer> findCustomerByRegDate(Date regDate) {
	   String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate"
	   		+ " FROM Customer WHERE Date(regDate)=?";
	   //짧게하는 방법1
	   return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class),regDate);
   }
   
   //이메일로 조회
   public Customer findCustomerByEmail(String email) {
	   String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate "
		   		+ " FROM Customer WHERE email=?";
	   //짧게하는 방법2
	   return jdbcTemplate.queryForObject(sql, new CustomerRowMapper(), email);
   }
   
   public long countCustomers() {
	   String sql = "SELECT count(*) FROM Customer";
	   return jdbcTemplate.queryForObject(sql, Long.class);
   }

}