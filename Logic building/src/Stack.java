public class Stack {
	
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}
	}
	
	private Node first, last; 
	public void push(int data) {
		Node n = new Node(data);
		if(last == null)
			last = n;
		if(first != null)
			n.setNext(first);
			
			first = n;	
	}
	
	public int pop() {
		if(first != null) {
		int data = first.getData();
		first = first.getNext();
		return data;
		}else {
			System.out.println("Stack is empty");
			return 0;
		}

}
	
}
