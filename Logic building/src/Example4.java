
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check the validity of statement
		//quote String must contain at least one word from vocab array
		//In failure to that quote will be considered invalid
		
		String[] vocab = {"is","are","am","of","an","a"};
		String quote = "These Are Apples";
		
		//quote = quote.toLowerCase(); not use this
		
		//write your logic to check the validity here, and print result.
		boolean flag = false;
		for(String word : vocab) {
		  if(quote.contains(" " + word + " ")) {
			//if(quote.indexOf(word) != -1){
				flag = true;
			    break;
			
			}
				
		}
		
		System.out.println(flag?"Valid quote":"Invalid quote");

	}

}
