
public class EmailValidator2 {

	   // 1- min 4 chars before @
	   // 2- min 3 chars between @ and .
	   // 3- min 2 chars after .
	   // 4- only 1 occurrence of @ and . is allowed
	   // Note: No regular expression is allowed

	   public static boolean isValidEmail(String email) {
	       int at_index = email.indexOf('@');
	       int dot_index = email.indexOf('.', at_index);

	       if (at_index == -1 || dot_index == -1 || dot_index - at_index <= 1 || dot_index == email.length() - 1)
	           return false;

	       boolean validCharacters = true;
	       for (char c : email.toCharArray()) {
	           if (!Character.isLetterOrDigit(c) && c != '_' && c != '-' && c != '@' && c != '.') {
	               validCharacters = false;
	               break;
	           }
	       }

	       return validCharacters && countOccurrences(email, '@') == 1 && countOccurrences(email, '.') == 1
	&& at_index >= 4 && dot_index - at_index >= 3 && email.length() - dot_index >= 3;
	   }

	   public static int countOccurrences(String text, char target) {
	       int count = 0;
	       for (char c : text.toCharArray()) {
	           if (c == target) {
	               count++;
	           }
	       }
	       return count;
	   }

	   public static void main(String[] args) {
	       String email = "z@gmail.com";

	       if (isValidEmail(email))
	           System.out.println("Valid email");
	       else
	           System.out.println("Invalid email");
	   }
	}