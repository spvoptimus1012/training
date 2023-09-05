
public class Person {
	private String name;
	private int age;
	
	public Person() {
		//name = "Anonymous";
		//age = -1;
		// Constructor chaining...
		this("Anonymous", -1); // calling another constructor with matching signature
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//public void setState(String n, int a) {
		//name = n;
		//age = a;
	//}

	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
		
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person p) {
		//	Person p = (Person) obj;
			if(this.age == p.age && name.equals(p.name))
				return true;
			
		}
		return false;
	}

	public static void main(String[] args) {
		//Declaration = Instantiation
		Person p1 = new Person("Mili", 20);
		p1.print();
		
		//Person p2 = new Person();
		//p2.print();
		System.out.println(p1.hashCode());
	 System.out.println(p1.toString());// calling the toString()
	 
	 Person p2 = new Person("Mili", 20);
	 System.out.println(p2);
	 System.out.println(p1.equals(p2));
}}
