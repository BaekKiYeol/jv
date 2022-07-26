package com.varxyz.test.mvc.addAccount;

import java.text.ParseException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.test.mvc.DataSourceConfig;
import com.varxyz.test.mvc.Customer.Customer;

public class AccountDaoTest {

   public static void main(String[] args) throws ParseException {
      AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(DataSourceConfig.class);
      
      AccountDao dao = context.getBean("accountDao", AccountDao.class);
      
      addAccount(dao);
//      findAccountsBySsn(dao);
      context.close();
   }
   
   //계좌추가
   private static void addAccount(AccountDao dao) {
	   Account a = new Account();
	      System.out.println("Account insert start");
	      a.setCustomer(new Customer(1001));
	      a.setAccountType('S');
	      a.setAccountNum("508-12-6789");
	      a.setBalance(1000);
	      a.setInterestRate(0.2);
	      dao.addAccount(a);
	      System.out.println("Account insert end");
   }
   
   //주민번호로 조회
   public static void findAccountsByCustomerId(AccountDao dao) {
	      System.out.println("\n[findAccountsByCustomerId]");
	      long customerId = 1001;
	      System.out.println(dao.findAccountsByCustomerId(customerId));
	   }
   
}