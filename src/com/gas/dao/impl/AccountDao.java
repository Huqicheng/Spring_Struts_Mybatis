package com.gas.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gas.dao.IAccountDao;
import com.gas.entity.Account;
import com.gas.mapper.AccountMapper;

@Repository
@Transactional(rollbackFor=Exception.class)
public  class AccountDao implements  IAccountDao {
	
	// indicate the mapper according to the annotation
	@Resource(name="accountMapper")
	private AccountMapper accountMapper;
	
	public void delete(Long entity_id) throws Exception{
		accountMapper.removeAccount(entity_id);
	}

	@Transactional(readOnly=true,propagation=Propagation.NOT_SUPPORTED)
	public Account find(Long entity_id) {
		return accountMapper.getAccountById(entity_id);
	}

	public void save(Account entity) throws Exception{
		accountMapper.addAccount(entity);
	}

	public void update(Account entity) throws Exception{
		accountMapper.editAccount(entity);
	}
	
	public List<Account> getList(){
		return (List<Account>) accountMapper.getAllAccount();
	}

}
