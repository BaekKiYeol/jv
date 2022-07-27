package com.varxyz.test.mvc.Account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCommand {
	private char accountNum;
	private char accType;
	private double balance;
	private double interestRate;
	private double overAmount;
	
}
