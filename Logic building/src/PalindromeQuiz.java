import java.util.Scanner;

public class PalindromeQuiz {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String word = console.next();
		
		System.out.println(checkPalindrome(word) ? "Palindrome" : "Not Palindrome");
	}
	private static boolean checkPalindrome(String word) {
		
		
		
			  int n = word.length();
			  for (int i = 0; i < (n/2); ++i) {
			     if (word.charAt(i) != word.charAt(n - i - 1)) {
			         return false;
			     }
			  }

			  return true;
			}
		
	}
