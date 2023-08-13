package com.nestjavatraining.entity;

public class SavingsMaxAccount extends SavingsAccount
{
	public SavingsMaxAccount(String accountCode, String accountName, String openingDate, double savingsAccountBalance)
	{
		super(accountCode, accountName, openingDate, savingsAccountBalance);
	}

	@Override
	public String toString()
	{
		return "Nil";
	}
}