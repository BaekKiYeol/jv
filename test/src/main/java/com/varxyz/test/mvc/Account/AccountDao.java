package com.varxyz.test.mvc.Account;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("accountDao")
public class AccountDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AccountDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//계좌생성
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (userId, accountNum, accType, balance, interestRate, overAmount)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		System.out.println(account.getAccountType());
	      if(account.getAccountType() == "S") {
	          jdbcTemplate.update(sql, account.getUserId(),
	                account.getAccountNum(), account.getAccountType(), account.getBalance(), 
	                account.getInterestRate(), 0.0);   
	       }else {
	          jdbcTemplate.update(sql,account.getUserId(),
	                account.getAccountNum(), account.getAccountType(), account.getBalance(), 
	                0.0, account.getOverAmount());
	       }
		
	}
	
	//계좌조회(아이디로)
	public List<Account> findAccountById(String userId) {
		 String sql = "SELECT a.aid, a.customerId, a.accountNum, a.accType, "
			   		+ "a.balance, a.interestRate, a.overAmount, a.regDate "
			   		+ "FROM Account a INNER JOIN Customer c "
			   		+ "ON a.userId = c.cid WHERE c.userId = ?";
		 
		 return jdbcTemplate.query(sql, new AccountRowMapper(), userId); 
	
	}
}
