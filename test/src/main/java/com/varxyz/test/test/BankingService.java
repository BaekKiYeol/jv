package com.varxyz.test.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.test.mvc.DataSourceConfig;
import com.varxyz.test.mvc.Account.Account;
import com.varxyz.test.mvc.Account.AccountDao;

public interface BankingService {
	
	AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
	AccountDao dao = context.getBean("accountDao", AccountDao.class);
	
	public boolean addCustomer(String userId, String passwd, String name, String ssn, String phone);
	
	public String addAccount(String accountNum, String userId);
	
	public List<Account> getAccounts(String userId);
	
	public boolean transfer(double amount, String depositAccountNum, String withdrawAccountNum);
	
	public boolean saveInterest(double interestRate);
	
	public double getBalance(String accountNum);
}
