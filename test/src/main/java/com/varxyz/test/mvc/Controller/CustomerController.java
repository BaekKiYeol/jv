package com.varxyz.test.mvc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.test.mvc.Customer.Customer;
import com.varxyz.test.mvc.Service.CustomerService;
import com.varxyz.test.mvc.Service.CustomerServiceImpl;

@Controller("test.addCustomerController")
public class CustomerController {
	
	@GetMapping("/test/add_customer")
	public String addCustomerForm() {
		return "test/add_customer";
	}
	
	@PostMapping("/test/add_customer")
	public String addAccount(Customer customer, Model model) {
		CustomerService service = new CustomerServiceImpl();
		
		model.addAttribute(customer);
		service.addCustomer(customer);
		
		CustomerService.context.close();
		return "test/success_add_customer";
	}
}
