package com.ey.bank;

public final class AccountsFactory {// final or abstract
	
	private AccountsFactory() {// constructor is making private here so no one can create object outside.
		
	}
	public static Saving createSavingAccount(String holder) {
		return new Saving(holder);
		
	}
	
	public static current createCurrentAccount(String holder) {
		return new current(holder);
	}

}
