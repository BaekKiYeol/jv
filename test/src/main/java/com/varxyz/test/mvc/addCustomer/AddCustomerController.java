package com.varxyz.test.mvc.addCustomer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("test.addCustomerController")
public class AddCustomerController {
	
	@GetMapping("/test/add_customer")
	public String addCustomerForm() {
		return "test/add_customer";
	}
	
	@PostMapping("/test/add_customer")
	public String addCustomer(CustomerCommand customerCommand, Model model) {
		System.out.println(customerCommand.getEmail());
		model.addAttribute("customer", customerCommand);
		return "test/success_add_customer";
	}
}
