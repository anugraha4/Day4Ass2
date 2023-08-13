package com.nestjavatraining.entity;

public abstract class Account {
	private String accountCode;
	private String accountName;
	private String openingDate;

	public Account(String accountCode, String accountName, String openingDate) {
		this.accountCode = accountCode;
		this.accountName = accountName;
		this.openingDate = openingDate;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
}