package com.varxyz.test.mvc.Account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public void deposit(double amount) {
		
	}
	
}
