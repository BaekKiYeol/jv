package banking.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class Account {
	protected long aid;
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	protected Date regDate;
	protected char accountType;
	
	public Account() {
		
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	//Account 생성자 : 계좌번호와 초기 입금금액을 받는다.
	
	public void deposite(double amount) {
		System.out.println("입금 전 금액 : " + balance + "원");
		this.balance += amount;
		System.out.println("잔고에 " + amount + "원을 입금하였습니다.\n" + "입금 후 금액 : " + balance + "원\n-------------------"  );
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}

	public void setAid(long long1) {
		// TODO Auto-generated method stub
		
	}

	public void setAccountNum(double double1) {
		// TODO Auto-generated method stub
		
	}

	public void setInterestRate(double double1) {
		// TODO Auto-generated method stub
		
	}

	public void setAccountType(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setUserId(String string) {
		// TODO Auto-generated method stub
		
	}
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp timestamp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString () {
		return accountNum + "," + balance + "," + customer.getName() + "," + customer.getPhone() + "," + regDate;
	}

}
