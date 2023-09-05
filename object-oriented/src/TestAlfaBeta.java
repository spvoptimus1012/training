
public class TestAlfaBeta {
	public static void main(String[] args) {
		Alfa a = new Alfa();
		a.demo();
		//Beta bt = (Beta)a;
		Beta b = new Beta();
		b.test();
		b.demo();
		
		Alfa ab = b; //Up-casting(implicit)
		ab.demo();
		//ab.test();//Error
		
		Beta ba =(Beta)ab; // Down-casting (Explicit)
	}

}
