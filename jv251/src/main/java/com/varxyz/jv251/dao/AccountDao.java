package com.varxyz.jv251.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.CheckingAccount;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingAccount;

public class AccountDao {

	public AccountDao() {
	
	}
	
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, accountType, customerId)" + " VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
			con = DataSourceManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, account.getAccountNum());
		    pstmt.setDouble(2, account.getBalance());
		    if(account instanceof SavingAccount) {
		    	SavingAccount sa = (SavingAccount)account;
		    	pstmt.setDouble(3, sa.getinterestRate());
		    	pstmt.setDouble(4, 0.0);
		    	pstmt.setString(5, String.valueOf('S'));
		    }else {
		    	CheckingAccount ca = (CheckingAccount)account;
		    	pstmt.setDouble(3, 0.0);
		    	pstmt.setDouble(4, ca.getOverdraftAmount());
		    	pstmt.setString(5, String.valueOf('C'));
		    }
		    	pstmt.setLong(6, account.getCustomer().getCid());
		    	pstmt.executeUpdate();
			}finally {
				DataSourceManager.close(pstmt, con);
			}
			System.out.println("NEW ACCOUNT INSERTED.....\n");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 전달된 주민번호를 가진 특정 고객의 계좌 목록 조회
	 * @param ssn  주민번호
	 * @return
	 */
	
	public List<Account> findAccountBySsn(String ssn) {
		String sql = "SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = ?";
		List<Account> list = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
			con = DataSourceManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ssn);
			rs = pstmt.executeQuery();
		    Account account = null;
			while(rs.next()) {
				if(rs.getString("accountType").charAt(0) == 'S') {
					account = new SavingAccount(sql, 0);
					((SavingAccount)account).setInteresRate(rs.getDouble("interestRate"));
				}else {
					account = new CheckingAccount();
					((CheckingAccount)account).setOverdraftAmount(rs.getDouble("interestRate"));
				}
				account.setAid(rs.getLong("aid"));
				account.setAccountNum(rs.getString("accountNum"));
				account.setBalance(rs.getDouble("balance"));
				account.setCustomer(new Customer(rs.getString("name"),rs.getString("ssn"),rs.getString("phone"), rs.getString("userId"), rs.getString("passwd")));
				account.setRegDate(rs.getTimestamp("regDate"));
				list.add(account);
			}
			
		}finally {
			DataSourceManager.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Account> findAllAccounts(String ssn) {
		String sql = "SELECT * FROM Account";
		List<Account> accountList = new ArrayList<Account>();
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Account a = null;
					a.setAid(rs.getLong("aid"));
					a.setAccountNum(rs.getDouble("accountNum"));
					a.setBalance(rs.getDouble("balance"));
					a.setInterestRate(rs.getDouble("interestRate"));
					a.setAccountType(rs.getString("accountType"));
					a.setCustomerId(rs.getString("customerId"));
					accountList.add(a);

				}
			}finally {
				DataSourceManager.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return accountList;
		}
	
	public void depositAccount(String accountNum, double amount) {
		String sql = "UPDATE Account SET balance = balance + ? WHERE accountNum = ?";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setDouble(1, amount);
				pstmt.setString(2, accountNum);
				rs = pstmt.executeQuery();
				Account a = null;
				while(rs.next()) {
					
				}
		}finally {
			DataSourceManager.close(rs, pstmt, con);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

