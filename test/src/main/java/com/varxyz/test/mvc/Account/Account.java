package com.varxyz.test.mvc.Account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	private long aid;
	private String userId;
	private String accountNum;
	private String accountType;
	private double balance;
	private double interestRate;
	private double overAmount;
	
	public Account() {
		super();
	}
	
	public Account(String userId) {
		this.userId = userId;
	}
	
}
