package com.gas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gas.dao.IAccountDao;
import com.gas.entity.Account;
import com.gas.service.AccountService;


@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Resource
	private IAccountDao accountDao;
	
	@Override
	public boolean addAccount(Account entity) throws Exception {
		accountDao.save(entity);
		return true;
	}

	@Override
	public Account getAccount(Long id) throws Exception {
		return accountDao.find(id);
	}

	@Override
	public List<Account> getAccounts() throws Exception {
		return accountDao.getList();
	}

	@Override
	public void removeAccount(Long id) {
		try {
			accountDao.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
