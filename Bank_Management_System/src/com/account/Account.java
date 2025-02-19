package com.account;

public class Account {
	private String accountId;
    private String accountType;
    private double balance;
    
	public Account(String accountId, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}
	
    public static Account createAccount(String accountId, String accountType, double initialBalance) {
		return new Account(accountId,accountType,initialBalance);
	}
    
    public String viewAccountDetails() {
        return "Account ID: " + accountId + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
   
    public void depositMoney(double amount) {
    	if (amount > 0) {
    		this.balance += amount;
    	} else {
    		System.out.println("Invalid deposit amount.");
    	}
    }
    
    public void withdrawMoney(double amount) {
    	if (amount > 0 && amount <= this.balance) {
    		this.balance -= amount;
    	} else {
    		System.out.println("Invalid withdrawal amount or insufficient balance.");
    	}
    }
}
