package com.varxyz.test.mvc.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.varxyz.test.mvc.Account.Account;
import com.varxyz.test.mvc.Account.CheckingAccount;
import com.varxyz.test.mvc.Account.SavingAccount;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = null;
		char accType = rs.getString("accType").charAt(0);
		if(accType == 'C') {
			account = new CheckingAccount();
			CheckingAccount ca = (CheckingAccount)account;
			ca.setOverdraftAmount(rs.getDouble("overAmount"));
		}else {
			account = new SavingAccount();
			SavingAccount sa = (SavingAccount)account;
			sa.setInterestRate(rs.getDouble("interestRate"));
		}
		account.setAid(rs.getLong("aid"));
		account.setUserId(rs.getString("userId"));
		account.setAccountNum(rs.getString("accountNum"));
		account.setAccountType(rs.getString("accType"));
		account.setBalance(rs.getDouble("balance"));
		account.setRegDate(rs.getTimestamp("regDate"));
		
		return account;
	}

}
