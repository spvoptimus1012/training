//Privileged based access

import com.ey.stock.Broker;
import com.ey.stock.Exchange;
import com.ey.stock.Holder;
import com.ey.stock.Stock;
import com.ey.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stock tisco = new Stock();
		
		//Holder h = tisco;
		Holder h = StockSingleton.getStock();
     	h.viewQuote();
		
		//Broker b = tisco;
     	Broker b = StockSingleton.getStock();
     	b.viewQuote();
		b.getQuote();
		
		//Exchange e = tisco;
		Exchange e = StockSingleton.getStock();
		e.viewQuote();
		e.getQuote();
		e.setQuote();
		
		System.out.println(h == b);
		System.out.println(e == b);
	}

}
