// Immutable Class(the state cannot be changed once set).Ex:-
public class Aadhar1 { 
	private long uid;
	private String retina;
	
	public Aadhar1(long l, String string) {
		this.uid = 0;
		// TODO Auto-generated constructor stub
		this.retina = "";
	}

	public void Aadhar1(long uid, String retina) {
		this.uid = uid;
		this.retina = retina;
	}

	public long getUid() {
		return uid;
	}

	public String getRetina() {
		return retina;
	}

	@Override
	public String toString() {
		return "Aadhar [uid=" + uid + ", retina=" + retina + "]";
	}
	
	public static void main(String[] args) {
		Aadhar1 a1 = new Aadhar1(9876543210L, "HAHA");
		System.out.println(a1);
	}
	

}
