package com.varxyz.test.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public String login(HttpServletRequest request, Customer customer, Model model, HttpSession session) {
//		session = request.getSession();
		customerService.login(customer.getUserId(), customer.getPasswd());
//		Customer result = customerService.login(userId, passwd);
//		if(true) {
//			return "test/main";
//		} else {
//			return "test/login";
//		}

//		//세션 정보 전달
//		session.setAttribute("userIdSession", customer.getUserId());
		return "test/main";
//		
//	}
	
	}
}
