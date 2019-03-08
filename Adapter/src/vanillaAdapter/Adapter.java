package vanillaAdapter;

// Adapter Class implementing the Target Interface
public class Adapter implements Target {

	// An instance of Adaptee
	private Adaptee adaptee;

	public Adapter() {
		adaptee = new Adaptee();
	}

	// The request performs the request on the Adaptee
	public void request() {
		System.out.println("The Adapter request!");
		adaptee.specificRequest();
	}

}
