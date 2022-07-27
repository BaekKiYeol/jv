package com.varxyz.test.mvc.Service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.test.mvc.DataSourceConfig;
import com.varxyz.test.mvc.Account.Account;
import com.varxyz.test.mvc.Account.AccountDao;

public interface AccountService {
	AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
	AccountDao dao = context.getBean("accountDao", AccountDao.class);
	
	public void addAccount(Account account);
	
	public List<Account> findAccountById(String userId);

}
