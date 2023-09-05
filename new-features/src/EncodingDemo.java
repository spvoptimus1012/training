import java.beans.Encoder;
import java.util.Base64;
import java.util.Base64.Decoder;

public class EncodingDemo {

	public static void main(String[] args) {
		
		String password = "P@ssw0rd";
		System.out.println(password);
		
		java.util.Base64.Encoder encoder = Base64.getEncoder();
		String encodepassword = encoder.encodeToString(password.getBytes());
		System.out.println(encodepassword);
		
		Decoder decoder = Base64.getDecoder();
		String decodedPassword = new String(decoder.decode(encodepassword.getBytes()));
		System.out.println(decodedPassword);
		
		

	}

}
