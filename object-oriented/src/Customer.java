
public class Customer {
	private int custId;
	private String custName;
	private int creditLimit;
	private static int custId_counter =101;
	
	public Customer() {
		
	}
	public Customer(String custName , int creditLimit) {
		this.custId = custId_counter++;
		this.custName = custName;
		this.creditLimit = creditLimit;	

}
	public void details() {
		System.out.println("cust Id: " + custId);
		System.out.println("cust Name: " + custName);
		System.out.println("creditLimit: " + creditLimit);
	}
	public int getCreditLimit() {
		return creditLimit;
	}
}
	
