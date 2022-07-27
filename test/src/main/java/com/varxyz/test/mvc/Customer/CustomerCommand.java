package com.varxyz.test.mvc.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCommand {
	private String userId;
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	
}
