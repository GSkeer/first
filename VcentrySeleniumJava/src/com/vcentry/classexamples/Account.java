package com.vcentry.classexamples;

public class Account {
	
	private String name;
	private String accountNumber;
	private String phone;
	private double balance;
	private String email;
	private String referer;

	public void setBalance(double balance) {
		this.balance = balance;
		balance = 400d;
	}
	
	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
