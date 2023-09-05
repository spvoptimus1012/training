
public class ChildDemo<S, V> extends Generic<S> {
	private V dummy;
	
	public ChildDemo(S data, V dummy) {
		super(data);
		this.dummy = dummy;
	}

	public V getDummy() {
		return dummy;
	}

	public void setDummy(V dummy) {
		this.dummy = dummy;
	}
	
	public static void main(String[] args) {
		ChildDemo<String, Integer> cd1 = new ChildDemo<String, Integer>("Jack", 33);
		System.out.println(cd1.getData() + "\t" + cd1.getDummy());
	}

}
