package vanillaProxy;

// The Proxy Class handling requests on the Subject
public class Proxy implements Subject {

	// An instance of the Subject
	private RealSubject realSubject;

	// Instantiation of Subject
	public Proxy() {
		realSubject = new RealSubject();
	}

	// The request on the Subject handled by the Proxy
	public void request() {
		System.out.println("The request by the Proxy!");
		realSubject.request();
	}

}
