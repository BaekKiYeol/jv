package com.varxyz.test.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.test.mvc.Account.Account;
import com.varxyz.test.mvc.Customer.Customer;
import com.varxyz.test.mvc.Service.AccountService;
import com.varxyz.test.mvc.Service.AccountServiceImpl;

@Controller("test.findAccountController")
public class FindAccountController {
	
	@GetMapping("/test/find_account")
	public String findAccountForm() {
		return "test/find_account";
	}
	
	@PostMapping("/test/find_account")
	public String findAccount(Customer customer, Account account, Model model) {
		List<Account> accountList = new ArrayList<>();
		
		AccountService service = new AccountServiceImpl();
		accountList = service.findAccountById(account.getUserId());
		
		model.addAttribute("accountList", accountList);	
		AccountService.context.close();
		return "test/success_find_account";
	}
}
