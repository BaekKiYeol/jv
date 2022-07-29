package com.varxyz.test.test;

import java.util.List;

import com.varxyz.test.mvc.Account.Account;

public class TransferAccount implements BankingService {
	
	//고객 추가
	@Override
	public boolean addCustomer(String userId, String passwd, String name, String ssn, String phone) {
		return true;
	}

	//계좌 추가
	@Override
	public String addAccount(String accountNum, String userId) {

		return null;
	}
	
	//계좌목록 조회
	@Override
	public List<Account> getAccounts(String userId) {

		return null;
	}

	//이체
	@Override
	public boolean transfer(double amount, String depositAccount, String withdrawAccount) {
		Account sendAccount = new Account();
		Account receiveAccount = new Account();
		sendAccount.setBalance(withdraw(depositAccount, amount));
		receiveAccount.setBalance(deposit(withdrawAccount, amount));
		return true;
	}

	private double deposit(String accountNum, double amount) {
		Account account = new Account();
		account.setBalance(getBalance(accountNum) + amount);
		return getBalance(accountNum)+amount;
	}
	
	private double withdraw(String accountNum, double amount) {
		Account account = new Account();
		account.setBalance(getBalance(accountNum) - amount);
		return getBalance(accountNum)+amount;
	}

	//이자
	@Override
	public boolean saveInterest(double interestRate) {
		return true;
	}

	//잔고 확인
	@Override
	public double getBalance(String accountNum) {
		return 0.0;
	}

	
}
