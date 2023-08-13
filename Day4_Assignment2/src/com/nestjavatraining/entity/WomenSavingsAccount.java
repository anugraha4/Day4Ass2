package com.nestjavatraining.entity;

public class WomenSavingsAccount extends SavingsAccount 
{
	
	private int freeLimit;

	public WomenSavingsAccount(String accountCode, String accountName, String openingDate, double savingsAccountBalance,
			int freeLimit) {
		super(accountCode, accountName, openingDate, savingsAccountBalance);
		this.freeLimit = freeLimit;
	}

	public int getFreeLimit() 
	{
		return freeLimit;
	}

	public void setFreeLimit(int freeLimit)
	{
		this.freeLimit = freeLimit;
	}

	@Override
	public String toString()
	{
		return String.valueOf(freeLimit);
	}
}