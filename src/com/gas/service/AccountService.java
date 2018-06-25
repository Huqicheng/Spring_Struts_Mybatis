package com.gas.service;

import java.util.List;

import com.gas.dao.IAccountDao;
import com.gas.entity.Account;

public interface AccountService{

	public boolean addAccount(Account entity) throws Exception;
	
	public Account getAccount(Long id) throws Exception;
	
	public List<Account> getAccounts() throws Exception;
	
	public void removeAccount(Long id);
}
