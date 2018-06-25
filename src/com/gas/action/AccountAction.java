package com.gas.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.gas.dao.IAccountDao;
import com.gas.entity.Account;
import com.gas.mapper.AccountMapper;
import com.gas.service.AccountService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class AccountAction extends ActionSupport{
	private AccountService accountService;
	private Logger logger = Logger.getLogger(AccountAction.class);
	public String execute() throws Exception {
		Account account =accountService.getAccount(5l);
		return "success";
	}
	public AccountService getAccountService() {
		return accountService;
	}
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
}
