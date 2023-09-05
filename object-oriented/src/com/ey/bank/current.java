package com.ey.bank;

public class current extends Accounts {

	private double overdraft;

	public current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public current(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;
		txns.add(new CurrentTransaction("OB", OPENING_CURRENT_BAL, balance, overdraft));
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {

		// if((10000-overdraft)>=amount ) {

		// overdraft+=amount;

		// amount=0;

		// }
		overdraft += amount;
		if (overdraft > OVERDRAFT_LIMIT) {
			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;
		}
		txns.add(new CurrentTransaction("CR", amount, balance, overdraft));
		// else {

		// overdraft =10000;

		// amount-=(10000-overdraft);

		// }

		// balance+=amount;

	}

	@Override
	public void withdraw(double amount) throws BalanceException {

		// if(balance < amount) {

		// amount-=balance;

		// balance=0;

		// overdraft-=amount;

		// }

		// else balance-=amount;

		// }
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CURRENT_BAL) {
				overdraft += balance;
				balance = MIN_CURRENT_BAL;
			}
			txns.add(new CurrentTransaction("DR", amount, balance, overdraft));
		} else
			throw new BalanceException("Insufficient balance!");

	}

	@Override
	public void statement() {

	}
}
