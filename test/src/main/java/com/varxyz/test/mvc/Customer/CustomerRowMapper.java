package com.varxyz.test.mvc.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer(rs.getLong("cid"), rs.getString("email"), 
                rs.getString("name"), rs.getString("passwd"), rs.getString("ssn"), 
                rs.getString("phone"), rs.getDate("regDate"));
      return customer;
	}
}
