package com.varxyz.test.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.test.mvc.Customer.Customer;
import com.varxyz.test.mvc.Service.CustomerService;
import com.varxyz.test.mvc.Service.CustomerServiceImpl;

@Controller
public class LoginController {
	
	CustomerService customerService = new CustomerServiceImpl();
	
	@GetMapping("/test/login")
	public String loginForm() {
		return "test/login";
	}
	
	@PostMapping("/test/login")
	public String login(Customer customer) {
		if(customerService.login(customer.getUserId(),customer.getPasswd())) {
			return "test/mypage";
		}
		return "redirect:/";
	}
	
}
