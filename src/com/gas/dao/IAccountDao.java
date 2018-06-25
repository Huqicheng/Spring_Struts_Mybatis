package com.gas.dao;

import java.util.List;

import com.gas.entity.Account;

public interface  IAccountDao {

	public void save(Account entity) throws Exception;

	public void update(Account entity) throws Exception;
	
	public  void delete(Long entity_id) throws Exception;
	
	public  Account find(Long entity_id);
	
	public List<Account> getList();
	
}
