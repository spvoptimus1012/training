@FunctionalInterface
public interface Hello {
	
	String sayHello();
	
	//method is not defined inside interface
	//public String sayBye() {
	default String sayBye() {
		return "Good bye!";
	}
	
	static void greeting() {
		System.out.println("Good day!");
	}

}
