package com.varxyz.test.mvc.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/test/main")
	public String mainForm(HttpSession session, Model model) {
		//세션 정보 검사
		if(session.getAttribute("userIdSession")==null) {
			model.addAttribute("msg", "로그인 정보가 일치하지 않습니다.");
			model.addAttribute("url", "/test/login");
			return "test/error";
		}else {
			session.getAttribute("userIdSession");
			System.out.println(session.getAttribute("userIdSession"));
			return "test/main";
		}
	}	
}