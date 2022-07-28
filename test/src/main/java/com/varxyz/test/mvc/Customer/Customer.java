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
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	private Date regDate;
	
	public Customer() {
		super();
	}
	
	public Customer(String userId, String passwd) {
		this.userId = userId;
		this.passwd = passwd;
	}
}
