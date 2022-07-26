package com.varxyz.test.mvc.addCustomer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.test.mvc.DataSourceConfig;

public class AddCustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		AddCustomerDao dao = context.getBean("addCustomerDao", AddCustomerDao.class);
//		addCustomer(dao);

		context.close();
	}
	
//	public static void addCustomer(AddCustomerDao dao) {
//		Customer c = new Customer();
//		c.setEmail("jojo@java.com");
//		c.setPasswd("1234");
//		c.setName("조조");
//		c.setSsn("990909-1234567");
//		c.setPhone("010-1234-5678");
//		
//		dao.addCustomer(c);
//		System.out.println("-inserted-");
//	}
	
}
