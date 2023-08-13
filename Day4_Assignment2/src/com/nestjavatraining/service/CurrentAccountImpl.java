package com.nestjavatraining.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraining.entity.ActiveCurrentAccount;
import com.nestjavatraining.entity.CurrentAccount;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.MaxAdvantageAccount;

public class CurrentAccountImpl implements AccountService {
	Scanner scanner = new Scanner(System.in);
	ArrayList<CurrentAccount> currentAccountList = new ArrayList<CurrentAccount>();

	@Override
	public Customer createCustomer(int c,String customerCode,String customerName,String accountCode,String openingDate) {
	
		Customer customer;
		if(c==1) {
			MaxAdvantageAccount maxAdvantage = new MaxAdvantageAccount(accountCode,"MaxAdvantage",openingDate,0);
			currentAccountList.add(maxAdvantage);
			customer = new Customer(customerCode,customerName,maxAdvantage);
			
		}
		else
		{
			ActiveCurrentAccount activeCurrent = new ActiveCurrentAccount(accountCode,"ActiveCurrent",openingDate,0);
			currentAccountList.add(activeCurrent);
			customer = new Customer(customerCode,customerName,activeCurrent);
			
		}
		System.out.println("Account Successfully created");
		return customer;
	}
	

	@Override
	public void depositeAccount(String accountCode,double amount) {
		int flag=0;
		for(CurrentAccount currentAccount : currentAccountList) {
			flag=1;
			if(currentAccount.getAccountCode().equals(accountCode)) {
				currentAccount.setCurrentAccountBalance(currentAccount.getCurrentAccountBalance() + amount);
				System.out.println("Money Successfully Deposited");
			}
		}
		if(flag!=1) {
			System.out.println("Account doesn't exist");
		}
	}

	@Override
	public void withdrawAccount(String accountCode, double amount) {
		int flag=0;
		for(CurrentAccount currentAccount : currentAccountList) {
			flag=1;
			if(currentAccount.getAccountCode().equals(accountCode)) 
			{
				currentAccount.setCurrentAccountBalance(currentAccount.getCurrentAccountBalance() - amount);
				System.out.println("Money Successfully Withdrawed");
			}
		}
		if(flag!=1) {
			System.out.println("Account doesn't exist");
		}	
		
}
}
