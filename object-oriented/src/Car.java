
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String...features ){//String[] features {var-args}
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features)
			System.out.println("> " + f);
	}
	public static void main(String[] args) {
		//String[] af = { "AC","Power Window","Keyless"};
		Car alto = new Car("Suzuki Alto","AC","Power Window","Keyless" );
		alto.specs();
		
	    //String[] sf = {"ABS","Keyless","Auto","Sunroof"};
		Car astor = new Car("MG Astor","ABS","Keyless","Auto","Sunroof" );
		astor.specs();
	}

}
