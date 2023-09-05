package com.ey.stock;

public final class StockSingleton {// make class as final and then create a default constructor.
	private StockSingleton() {
		
	}
	private static Stock stk;
	
	public static Stock getStock() {
		if(stk == null)
			stk = new Stock();
		
		return stk;
	}

}
