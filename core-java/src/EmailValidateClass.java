//Zubair's Method
public class EmailValidateClass {
public static void main(String[] args) {
	String email = "zubair@gmail.com";
	int iat = email.indexOf('@');
	int idot = email.indexOf('.');
	
	//if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') 
	//		&& iat >=4 && (idot - iat) >=3 && (email.length() - idot) >=2)// ?"Valid":"Invalid";
	//		System.out.println("valid Email");
	//		else
	//			System.out.println("Invalid Email");
	System.out.println(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') 
			&& iat >=4 && (idot - iat) >=3 && (email.length() - idot) >=2?"Valid Email":"Invalid Email");

}
}
