package com.nestjavatraining.entity;

public class MaxAdvantageAccount extends CurrentAccount
{
	private final double minimumBalance = 500000;

	public MaxAdvantageAccount(String accountCode, String accountName, String openingDate,
			double currentAccountBalance)
	{
		super(accountCode, accountName, openingDate, currentAccountBalance);
	}

	@Override
	public String toString()
	{
		return "Nil";
	}
}
