import java.util.Scanner;
public class ConsoleDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = console.next();
		System.out.print("Enter Age: ");// learn about nextInt and next() System.in and scanner and console in weekend.
		int age = console.nextInt();
		
		System.out.println("Your Name: " + name);
		System.out.println("Your Age: " + age);
	}

}
