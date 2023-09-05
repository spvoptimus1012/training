package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Accounts implements Bank {

	private int acntNo;

	private String holder;

	protected double balance;
	protected List<Transaction> txns;

	// Application Constant

	private static int actNoCounter = INIT_ACCOUNT_NO;

	public Accounts() {
	}

	public Accounts(String holder, double balance) {

		this.acntNo = actNoCounter++;

		this.holder = holder;

		this.balance = balance;

		txns = new ArrayList<>();

	}

	public void summary() {

		System.out.println("A/C No. " + acntNo);

		System.out.println("Holder: " + holder);

		System.out.println("Balance: " + balance);

	}

//Business logic
	public void deposit(double amount) {

		balance += amount;

		txns.add(new Transaction("CR", amount, balance));

	}

	// public abstract void withdraw(double amount) ;//{

	// if (amount <= balance)

	// balance -= amount;

	// else

	// System.out.println("Insufficient balance!");

	@Override
	public void statement() {
		txns.forEach(System.out::println);
	}

}
