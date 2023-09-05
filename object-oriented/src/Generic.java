
public class Generic<S> {


	private S data;

	public Generic(S data) {
		this.data = data;
	}

	public S  getData() {
		return data;
	}

	public void setData(S data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Generic<String> d1 = new Generic<String>("Hola");
		//d1.setData(3.14);
		System.out.println(d1.getData());
		
		Generic<Integer> d2 = new Generic<Integer>(99);
		//d2.setData("hi");
		System.out.println(d2.getData());
		
		Generic<Person> d3 = new Generic<Person>(new Person("Kim", 11));// pros- class is generic ,cons- here object is generic too.
		System.out.println(d3.getData());
	}
}


