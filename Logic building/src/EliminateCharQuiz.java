
public class EliminateCharQuiz {

	public static void main(String[] args) {
		
		String str = "Hello-Beautiful-World";
		
		System.out.println(eliminate(str, "-"));
	}
	
	private static String eliminate(String str, String ch) {
		StringBuilder result = new StringBuilder();

		 // don't use replace method

        for (char c : str.toCharArray()) {

            if (c != ch.charAt(0)) {

                result.append(c);

            }

        }

 

        return result.toString();
	}

}
