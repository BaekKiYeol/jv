package com.varxyz.test.mvc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.test.mvc.Account.Account;
import com.varxyz.test.mvc.Service.AccountService;
import com.varxyz.test.mvc.Service.AccountServiceImpl;

@Controller("test.TransferController")
public class TransferController {
	
	
	@GetMapping("/test/transfer_account")
	public String transferAccountForm() {
		return "test/transfer_account";
	}
	
	@PostMapping("/test/transfer_account")
	   public String transferAccount(Account account, Model model) {
	      AccountService service = new AccountServiceImpl();
	      model.addAttribute("Account", account);
	      
	      service.transferAccount(account);
	      AccountService.context.close();
			return "test/success_transfer_account";
	   }
	}
	
