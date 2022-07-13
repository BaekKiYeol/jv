package com.varxyz.jv251.domain;

import java.sql.Date;

import com.varxyz.jv251.exception.InsufficientBalanceException;

public class SavingAccount extends Account{
	public SavingAccount() {
		
	}
	
	public SavingAccount(String accountNum, double balance) {
		this(accountNum, balance, 0.0);
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
	}
	
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			 //잔고 부족 예외발생
			throw new InsufficientBalanceException("잔고 부족");
		}
		System.out.println("출금 전 금액 : " + balance + "원");
		balance -= amount;
		System.out.println("잔고에서 " + amount + "원을 출금하였습니다.");
		System.out.println("출금 후 금액 : " + balance + "원\n-------------------");
	}
	
//	이자율 생성 메소드
	public void setInteresRate(double interesRate) {
	}

	public double getinterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setRegDate(Date date) {
		// TODO Auto-generated method stub
		
	}
	public void setAccountType(char sa) {
		// TODO Auto-generated method stub
		
	}
	
}

