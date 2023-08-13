package com.nestjavatraining.entity;

public abstract class CurrentAccount extends Account
{
	private double currentAccountBalance;

	public CurrentAccount(String accountCode, String accountName, String openingDate, double currentAccountBalance) 
	{
		
		super(accountCode, accountName, openingDate);
		this.currentAccountBalance = currentAccountBalance;
	}

	public double getCurrentAccountBalance()
	{
		return currentAccountBalance;
	}

	public void setCurrentAccountBalance(double currentAccountBalance)
	{
		this.currentAccountBalance = currentAccountBalance;
	}
}
