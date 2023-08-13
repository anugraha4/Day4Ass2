package com.nestjavatraining.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.CurrentAccount;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.service.CurrentAccountImpl;
import com.nestjavatraining.service.SavingsAccountImpl;

public class BankUtility {
	static List <Customer> customerList = new ArrayList<Customer>();
	public static void main(String[] args) {
		Customer customer;
		SavingsAccountImpl savingsAccountImpl = new SavingsAccountImpl();
		CurrentAccountImpl currentAccountImpl = new CurrentAccountImpl();
		while (true) {
			System.out.println("****Welcome To ADBC Bank****");
			System.out.println(
					"1. Create Account\n2. Deposite Account\n3. Withdraw Account\n4. Display Accounts\n5. Exit");
			Scanner scanner = new Scanner(System.in);
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("1. Savings Account 2. Current Account");
				int a = scanner.nextInt();
				System.out.println("Enter Customer Code : ");
				String customerCode = scanner.next();
				System.out.println("Enter Customer Name : ");
				String customerName = scanner.next();
				System.out.println("Enter Opening Date : ");
				String openingDate = scanner.next();
				if (a == 1) {
					System.out.println("1. Women Savings Account  2. Savings Max Account");
					int c = scanner.nextInt();
					System.out.println("Enter Account Code : ");
					String accountCode = scanner.next();
					customer = savingsAccountImpl.createCustomer(c, customerCode, customerName, accountCode, openingDate);
					
				} else {
					System.out.println("1. Max Advantage Account  2. Active Current Account");
					int c = scanner.nextInt();
					System.out.println("Enter Account Code : ");
					String accountCode = scanner.next();
					customer = currentAccountImpl.createCustomer(c, customerCode, customerName, accountCode, openingDate);
					
					
				}
				customerList.add(customer);
				break;
			
			case 2:
				System.out.println(
						"1. Women Savings Account 2. Savings Max Account 3. Max Advantage Account 4. Active Current Account");
				int c2 = scanner.nextInt();
				System.out.println("Enter Account Code : ");
				String accountCode2 = scanner.next();
				System.out.println("Enter Amount ");
				double amt = scanner.nextDouble();
				if (c2 == 1 || c2 == 2) {
					
					savingsAccountImpl.depositeAccount(accountCode2, amt);
				} else {
					currentAccountImpl.depositeAccount(accountCode2, amt);
				}
				break;
			
			case 3:
				System.out.println(
						"1. Women Savings Account 2.Savings Max Account 3. Max Advantage Account 4. Active Current Account");
				int c = scanner.nextInt();
				System.out.println("Enter Account Code : ");
				String accountCode3 = scanner.next();
				System.out.println("Enter Amount ");
				double amt3 = scanner.nextDouble();
				
				if (c == 1 || c == 2) {
					savingsAccountImpl.withdrawAccount(accountCode3, amt3);
				} else {
					currentAccountImpl.withdrawAccount(accountCode3, amt3);
				}
				break;
			
			case 4:
				    displayAccounts();
				break;
			
			case 5:
				System.exit(0);
			}
		}
	}
	public static void displayAccounts() {
		boolean emp = customerList.isEmpty();
		if(emp == true) {
			System.out.println("Account doesn't exist");
		}
		else
		{
			int no =0;
			
			
			System.out.printf("%5s %15s %20s %20s %20s %20s %20s" ,"SINo","AccountCode","CustomerName","AccountType","CreateDate"," Balance","FreeLimit \n");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
			for(Customer customer : customerList) {
				
			    for(Account account : customer.getAccountList() ) {
			    	
			    
				no++;
				if(account.getAccountName().equals("WomenSavings") || account.getAccountName().equals("SavingsMax") )
				{
				System.out.format("%5s %15s %20s %20s %20s %20s %20s", no,account.getAccountCode(),customer.getCustomerName(),account.getAccountName() ,account.getOpeningDate(),((SavingsAccount) account).getSavingsAccountBalance(),account.toString()+"\n");
			    
			}
			else
			{
				System.out.format("%5s %15s %20s %20s %20s %20s %20s", no,account.getAccountCode(),customer.getCustomerName(),account.getAccountName() ,account.getOpeningDate(),((CurrentAccount) account).getCurrentAccountBalance(),account.toString()+"\n");
			    
			}
				System.out.println();
		}
	}
}
}
}
