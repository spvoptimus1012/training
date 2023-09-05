
public class Demo {
	private Object data;

	public Demo(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo("Hola");
		d1.setData(3.14);
		System.out.println(d1.getData());
		
		Demo d2 = new Demo(99);
		d2.setData("hi");
		System.out.println(d2.getData());
		
		Demo d3 = new Demo(new Person("Kim", 11));// pros- class is generic ,cons- here object is generic too.
		System.out.println(d3.getData());
	}
}
