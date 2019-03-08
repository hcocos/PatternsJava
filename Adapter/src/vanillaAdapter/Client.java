package vanillaAdapter;

public class Client {

	// This example is rather simple and only demonstrates
	// the separation of the Adaptee and the Client
	public static void main(String[] args) {

		Target target = new Adapter();
		target.request();

	}

}
