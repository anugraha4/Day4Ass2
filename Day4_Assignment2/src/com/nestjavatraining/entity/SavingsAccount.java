package com.nestjavatraining.entity;

public abstract class SavingsAccount extends Account
{
	private double savingsAccountBalance;

	public SavingsAccount(String accountCode, String accountName, String openingDate, double savingsAccountBalance) 
	{
		super(accountCode, accountName, openingDate);
		this.savingsAccountBalance = savingsAccountBalance;
	}

	public double getSavingsAccountBalance()
	{
		return savingsAccountBalance;
	}

	public void setSavingsAccountBalance(double savingsAccountBalance) 
	{
		this.savingsAccountBalance = savingsAccountBalance;
	}
}
