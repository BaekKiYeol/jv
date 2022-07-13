package com.varxyz.jv251.domain;

import com.varxyz.jv251.exception.InsufficientBalanceException;
import com.varxyz.jv251.exception.OverdraftException;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAccount, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) { //마이너스 통장
		if(balance < amount) {
			//잔고 부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			double overdraftNeeded = amount - balance;
			if(overdraftAmount < overdraftNeeded) {
				throw new OverdraftException("에러 : 대월금 초과", balance, overdraftNeeded);
//				System.out.println("출금 전 금액 : " + balance +"원");
//				balance = balance - amount;
//				System.out.println("출금 후 금액 : " + balance + "원");
			}else {
				//한도 부족 예외 발생
//				throw new InsufficientBalanceException("한도 부족");
				balance = 0.0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}
		}else {
			balance = balance-amount;
			System.out.println("잔액: " + balance);
		}
	}
	public void setOverdraftAmount(double setovdrdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setAccountType(char ca) {
		// TODO Auto-generated method stub
		
	}

}
