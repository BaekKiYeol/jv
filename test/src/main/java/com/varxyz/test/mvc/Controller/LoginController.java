package com.varxyz.test.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String login(HttpServletRequest request, Customer customer, Model model, HttpSession session) {
		session = request.getSession();
		CustomerService service = new CustomerServiceImpl();
		
		//로그인 유효성 검사
		try {
			boolean value = service.login(customer);
			if(!value) {
				model.addAttribute("msg", "로그인 정보가 일치하지 않습니다.");
				model.addAttribute("url", "/test/login");
				return "test/error";
			}
		}catch(EmptyResultDataAccessException e) {
			model.addAttribute("msg", "로그인 정보가 일치하지 않습니다.");
			model.addAttribute("url", "/test/login");
			return "test/error";
		}finally {
			CustomerService.context.close();
		}
		
		//세션 정보 전달
		session.setAttribute("userIdSession", customer.getUserId());
		return "redirect:/test/mypage";
	}
	
}
