package com.nestjavatraining.service;

import com.nestjavatraining.entity.Customer;

public interface AccountService {
	
	public Customer createCustomer(int c,String customerCode,String CustomerName,String accountCode,String OpeningDate);

	public void depositeAccount(String accountCode,double amount);

	public void withdrawAccount(String accountCode,double amount);
}
