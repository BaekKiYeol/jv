package com.varxyz.test.mvc.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.varxyz.test.mvc.Account.Account;
import com.varxyz.test.mvc.Customer.Customer;

public class TransferRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		
		account.setAid(rs.getLong("aid"));
		account.setCustomer(new Customer(rs.getString("userId")));
		account.getCustomer().setPasswd(rs.getString("passwd"));
		account.setAccountNum(rs.getString("accountNum"));
		account.setAccountType(rs.getString("accType"));
		account.setBalance(rs.getDouble("balance"));
		account.setRegDate(rs.getTimestamp("regDate"));
		
		return account;
	}

}
