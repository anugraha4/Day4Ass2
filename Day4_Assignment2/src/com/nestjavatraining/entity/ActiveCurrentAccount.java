package com.nestjavatraining.entity;

public class ActiveCurrentAccount extends CurrentAccount {
	
	public ActiveCurrentAccount(String accountCode, String accountName, String openingDate,
			double currentAccountBalance) 
	{
		super(accountCode, accountName, openingDate, currentAccountBalance);
	}

	public String toString() 
	{
		return "Nil";
	}
}
