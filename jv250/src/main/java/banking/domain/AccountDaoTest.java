package banking.domain;

import java.sql.Date;

public class AccountDaoTest {
	
	 public static void main(String[] args) {
	      AccountDao dao = new AccountDao();
	      
	      SavingAccount sa = new SavingAccount();
	      
	      sa.setAccountNum("567-89-0123");
	      sa.setBalance(4000.0);
	      sa.setCustomer(new Customer(1016));
	      sa.setInterestRate(0.04);
	      sa.setRegDate(new Date(0));
	      sa.setAccountType('S');
	      
	      dao.addAccount(sa);
	      for(Account account : dao.findAccountBySsn("951025-1234567")) {
	    	  System.out.println(account);
	      }
	 }
}
