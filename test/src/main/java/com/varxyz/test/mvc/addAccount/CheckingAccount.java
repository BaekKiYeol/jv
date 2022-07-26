package com.varxyz.test.mvc.addAccount;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public void deposit(double amount) {
		
	}
	
}
