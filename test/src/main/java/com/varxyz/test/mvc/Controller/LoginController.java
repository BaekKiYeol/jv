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
	public String login(HttpServletRequest request, Model model) {
		Customer dbcustomer = new Customer();
		dbcustomer = customerService.login(request.getParameter("userId"), 
				request.getParameter("passwd"));
		
		if(dbcustomer.getUserId().equals(request.getParameter("userId"))&&
				dbcustomer.getPasswd().equals(request.getParameter("passwd"))) {
		return "test/main";
		}else {
		model.addAttribute("msg", "로그인 실패");
		return "test/error";
		}
	}
}
