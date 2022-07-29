package com.varxyz.test.mvc.Controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.test.mvc.Service.AccountService;
import com.varxyz.test.mvc.Service.AccountServiceImpl;

@Controller("test.TransferController")
public class TransferController {
	
	
	@GetMapping("/test/transfer_account")
	public String transferAccountForm() {
		return "test/transfer_account";
	}
	
	@PostMapping("/test/transfer_account")
	   public String transferAccount(HttpServletRequest request, Model model) {
		
		if(request.getParameter("Account").trim().isEmpty() ||
		request.getParameter("passwd").trim().isEmpty() ||
		request.getParameter("transferAccount").trim().isEmpty() ||
		request.getParameter("amount").trim().isEmpty()) {
			model.addAttribute("msg", "공백 문자는 입력이 불가능합니다.");
			return "test/error";
		}
		
		
	    
	      
	      service.transferAccount(account);
	      AccountService.context.close();
			return "test/success_transfer_account";
	   }
	}
	
