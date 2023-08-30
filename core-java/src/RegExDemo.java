
public class RegExDemo {

	public static void main(String[] args) {
		String name = "satyam";
		String mobile = "3204644836";
		String email = "satyamvats10122000@gmail.com";
		
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		String mobileRegex = "[6-9]{1}[0-9]{9}";
		String emailRegex = "/^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,})$/";
		
		System.out.println(name.matches(nameRegex)?"Valid name":"Invalid name");
		System.out.println(mobile.matches(mobileRegex)?"Valid mobile":"Invalid mobile" );
		System.out.println(email.matches(emailRegex)?"Valid email":"Invalid email");		

	}

}
