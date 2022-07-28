package com.varxyz.test.mvc.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.exceptions.ClosedOnExpiredPasswordException;
import com.varxyz.test.mvc.RowMapper.AccountRowMapper;


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
		 String sql = "SELECT * FROM Account WHERE userId = ?";
		 return jdbcTemplate.query(sql, new AccountRowMapper(), userId); 
	}
	
	//계좌조회(계좌번호로)
		public List<Account> findAccountByAccountNum(String accountNum) {
		String sql = "SELECT * FROM Account WHERE accountNum = ?";
		return jdbcTemplate.query(sql, new AccountRowMapper(), accountNum); 
		}
	
	//잔액 확인
	public Account checkingBalance(String accountNum) {
		 String sql = "SELECT * FROM Account WHERE accountNum = ?";
		 return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>());
	}
	
	//입금
	public void depositAccount(String accountNum, double money) {
		 String sql = "UPDATE Account SET balance WHERE accountNum = ?";
		 jdbcTemplate.update(sql, checkingBalance(accountNum).getBalance()+money);
	}
	
	//출금
	public void withdrawAccount(String accountNum, double money) {
		String sql = "UPDATE Account SET balance WHERE accountNum = ?";
		jdbcTemplate.update(sql, checkingBalance(accountNum).getBalance()-money);
	}
	
	
}