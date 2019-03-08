package vanillaProxy;

// The Subject Class that should be manipulated
public class RealSubject implements Subject {

	// The actual request
	public void request() {
		System.out.println("The request on the RealSubject!");
	}

}
