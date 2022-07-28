package com.varxyz.test.mvc.Account;

import java.util.Date;

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
	private Date regDate;
	private String passwd;
	
	public Account() {
		super();
	}
	
	public Account(String userId) {
		this.userId = userId;
	}
	
}
