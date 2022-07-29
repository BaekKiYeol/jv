package com.varxyz.test.mvc.Service;

import java.util.List;

import com.varxyz.test.mvc.Account.Account;

public class AccountServiceImpl implements AccountService {
	
	@Override
	public void addAccount(Account account) {
		dao.addAccount(account);
	}
	
	@Override
	public List<Account> findAccountById(String userId) {
		return dao.findAccountById(userId);
	}

	@Override
	public void depositAccount(String accountNum, double money) {
		return dao.depositAccount(accountNum, money);
	}

	@Override
	public List<Account> findAccountByaccountNum(String accountNum) {
		return dao.findAccountByAccountNum(accountNum);
	}


	
	
}
