
public class TestCustomer {
public static void main(String[] args){
		
		Customer e1 = new Customer("SPV", 10000);
		e1.details();
		
		Customer e2 = new Customer("SPV", 20000);
		e2.details();
		
	System.out.println("creditLimit: " +e1.getCreditLimit());
	System.out.println("creditLimit: " +e2.getCreditLimit());
	}
}
