        //1- minimum 4 chars before @

	    //2- minimum 3 chars between @ and .

	    //3- minimum 2 chars after .

	    //4- only 1 occurrence of @ and . is allowed

	    //Note: No regular expression is allowed


public class EmailValidator {
	    

	    public static boolean isEmail_Valid(String Email)

	    {

	        int At_the_rate_index = Email.indexOf('@');

	        int Dot_index = Email.indexOf('.');

	        
	        if(At_the_rate_index <=0 || Dot_index<= At_the_rate_index+1 || Dot_index>=Email.length()-1)

	            return false;

	       
	        int at_count=0;

	        int dot_count=0;

	        for(char c: Email.toCharArray())  //.toCharArray convert the email string into an array of characters

	        {

	            if(c=='@') {at_count++;}

	            else if(c=='.') {dot_count++;}

	            else if(!Character.isLetterOrDigit(c) && c !='_' && c != '-') {return false;}  //Invalid character found

	        }

	        

	        return at_count == 1 && dot_count ==1   

	                && Email.substring(0, At_the_rate_index).length()>=4    
	                && Email.substring(At_the_rate_index +1, Dot_index).length()>=3   
	                && Email.substring(Dot_index + 1).length()>=2;   
	    }

	    

	    public static void main(String[] emailvalidator) {

	        String email = "Satyam.Vats@in.ey.com";
	       
	        if(isEmail_Valid(email))

	        System.out.println("valid email");

	        else System.out.println("Invalid email");

	    }

	 

	}

