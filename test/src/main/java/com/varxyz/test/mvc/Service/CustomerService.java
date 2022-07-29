package com.varxyz.test.mvc.Service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.test.mvc.DataSourceConfig;
import com.varxyz.test.mvc.Customer.Customer;
import com.varxyz.test.mvc.Customer.CustomerDao;

public interface CustomerService {
	AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
	CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
	
	public void addCustomer(Customer customer);
	
	public boolean login(String userId, String passwd);
}
