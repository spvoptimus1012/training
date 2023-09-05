import java.util.Scanner;

public class SortStringQuiz {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String word = console.next();
		
		System.out.println(sort(word));
		
	}
	
	private static String sort(String word) {
		char[] chars = word.toCharArray();
		int n = chars.length;
		for (int i =0; i < n; i++) {
			for(int j =0; j < n-i-1; j++) {
				char c = ' ';
				if(chars[j] > chars[j+1]) {
					// swapping logic
					    c = chars[j];
	
				        chars[j] = chars[j + 1];

					    chars[j + 1] = c;
				}
			}
		}
		return new String(chars);
	
		
//        int n = charArray.length;
//
//        for (int i = 0; i < n - 1; i++) {
//
//            for (int j = 0; j < n - i - 1; j++) {
//
//                if (charArray[j] > charArray[j + 1]) {
//
//                    // Swap characters
//
//                    char temp = charArray[j];
//
//                    charArray[j] = charArray[j + 1];
//
//                    charArray[j + 1] = temp;
//
//                }
//
//            }
//
//        }
//		return new String(charArray);
	}
}


