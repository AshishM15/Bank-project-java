package com.ashish;

public class BankAccount {
	private String accountNumber;
	private String name;
	private double balance;

	public BankAccount(String accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = 0.0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount Deposited: ₹" + amount);
		} else {
			System.out.println("Invalid amount!");
		}
	}

	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Amount Withdrawn: ₹" + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount!");
		}
	}

	public void showBalance() {
		System.out.println("Current Balance: ₹" + balance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
}
