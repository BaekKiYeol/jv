package com.varxyz.test.test;

import com.varxyz.test.mvc.Account.Account;

public class TransferAccountTest {
	/*
	 * 없는 계좌 및 불일치 계좌 입력시 예외처리
	 * 이체금액에서 벗어나는 금액 입력시 예외처리
	 */
	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		TransferAccount transferAccount = new TransferAccount();
		
		a1.setBalance(5000);
		a1.setAccountNum("111-11-1111");
		
		a2.setBalance(5000);
		a2.setAccountNum("222-22-2222");
		
		transferAccount.transfer(5000, a1.getAccountNum(), a2.getAccountNum());
	}
}
