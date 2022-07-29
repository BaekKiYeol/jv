package com.varxyz.test.mvc.Customer;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {
	private String userId;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	private String email;
	private Date regDate;
	
	public Customer() {
		super();
	}
	
	public Customer(String userId) {
		this.userId = userId;
	}
}
