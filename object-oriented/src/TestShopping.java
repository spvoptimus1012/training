import com.ey.shop.CartException;
import com.ey.shop.Product;
import com.ey.shop.ShoppingCart;

public class TestShopping {
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product p1 = new Product("iphone X", 23000);
		//try {
			cart.addToCart(p1);
			cart.addToCart(new Product("AirPods2", 8999));
			cart.addToCart(new Product("Apple Watch SE", 33000));
			cart.addToCart(new Product("Apple Watch 8", 93000));
			cart.addToCart(new Product("ipadAir", 99000));
			cart.addToCart(new Product("iMac", 133000));
	//	} catch (CartException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		
		
		
		cart.checkout();
	}

}
