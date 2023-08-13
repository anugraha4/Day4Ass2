package com.nestjavatraining.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;

public class SavingsAccountImpl implements AccountService {
	Scanner scanner = new Scanner(System.in);
	ArrayList<SavingsAccount> savingsAccountList = new ArrayList<SavingsAccount>();

	@Override
	public Customer createCustomer(int c,String customerCode,String customerName,String accountCode,String openingDate) {
		Customer customer;
		if(c==1) {
	
			System.out.println("Enter Free Limit : ");
			int freeLimit = scanner.nextInt();
			WomenSavingsAccount womenSavingsAccount = new WomenSavingsAccount(accountCode, "WomenSavings", openingDate,
					0, freeLimit);
			savingsAccountList.add(womenSavingsAccount);
			customer = new Customer(customerCode,customerName, womenSavingsAccount);
		
		} else {
			
			SavingsMaxAccount savingsMaxAccount = new SavingsMaxAccount(accountCode, "SavingsMax", openingDate, 0);
			savingsAccountList.add(savingsMaxAccount);
			 customer = new Customer(customerCode, customerName, savingsMaxAccount);
		}
		System.out.println("Account created Succesfully");
		return customer;
	}

	@Override
	public void depositeAccount(String accountCode,double amount) {
		int f=0;
		for (SavingsAccount savingsAccount : savingsAccountList) {
			f=1;
			if (savingsAccount.getAccountCode().equals(accountCode)) {
				savingsAccount.setSavingsAccountBalance(savingsAccount.getSavingsAccountBalance() + amount);
				System.out.println("Money deposited successfully");
			} 
		}
			if(f!=1) {
				System.out.println("Account doesn't exists ");
			
		}
	}

	@Override
	public void withdrawAccount(String accountCode,double amount) {
		int f = 0;
		for (SavingsAccount savingsAccount : savingsAccountList) {
			f=1;
			if (savingsAccount.getAccountCode().equals(accountCode)) {
				savingsAccount.setSavingsAccountBalance(savingsAccount.getSavingsAccountBalance() - amount);
				System.out.println("Money withdrawed successfully");
			} 
			if(f!=1)
			{
				
				System.out.println("Account doesn't exists ");
			}
		}
	}
}
