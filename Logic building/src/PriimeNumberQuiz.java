import java.util.Scanner;

public class PriimeNumberQuiz {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = console.nextInt();
		
		System.out.println(checkPrime(num) ? "Prime No" : "Composite No");
		
	}
	
	private static boolean checkPrime(int num) {
		//int flag=0;
		if(num <= 1)
			return false;
		for (int i1 = 2; i1 <= num / 2; i1++)
            if (num % i1 == 0)
                return false;
  
        return true;
    }
	

}
