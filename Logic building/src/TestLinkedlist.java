
public class TestLinkedlist {
	
	public static void main(String[] args) {
		
		Linkedlist lst = new Linkedlist();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		lst.print();
		
		System.out.println("--Adding After");
		lst.addAfter(20, 25);
		lst.addAfter(30, 35);
		lst.print();
		
		System.out.println("--Adding Before");
		lst.addBefore(20, 15);
		lst.addBefore(10, 5);
		lst.print();
		
		System.out.println("--After Removing");
		lst.remove(20);
		lst.remove(5);
		lst.print();
	}

}
