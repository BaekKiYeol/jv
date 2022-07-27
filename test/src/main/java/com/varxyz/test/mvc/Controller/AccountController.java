package com.varxyz.test.mvc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.test.mvc.Account.Account;
import com.varxyz.test.mvc.Service.AccountService;
import com.varxyz.test.mvc.Service.AccountServiceImpl;

@Controller("test.AccountController")
public class AccountController {
	
	@GetMapping("/test/add_account")
	public String addAccountForm() {
		return "test/add_account";
	}
	
	@PostMapping("/test/add_account")
	   public String addAccount(Account account, Model model) {
	      AccountService service = new AccountServiceImpl();
	      model.addAttribute("Account", account);
	      
	      service.addAccount(account);
	      AccountService.context.close();
			return "test/success_add_account";
	   }
	}
	
