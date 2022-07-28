package com.varxyz.test.mvc.Service;

import com.varxyz.test.mvc.Customer.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	@Override
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
	}

	@Override
	public boolean login(String userId, String passwd) {
		return false;
	}
}
