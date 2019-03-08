package vanillaProxy;

// The Virtual Proxy Class handling requests on the Subject
// The Virtual Proxy creates the Subject object on demand
public class VirtualProxy implements Subject {

	// An instance of the Subject
	private RealSubject realSubject;

	// The request on the Subject handled by the Proxy
	// If the Subject is not available it is created
	// This is called a Virtual Proxy
	public void request() {

		System.out.println("The request by the Virtual Proxy!");
		if (realSubject == null) {
			realSubject = getSubject();
		}
		realSubject.request();
	}

	// Instantiation of Subject
	public RealSubject getSubject() {
		return new RealSubject();
	}

	// Some method to test the state of Subject
	public boolean isRealSubject() {

		if (realSubject == null) {
			return false;
		} else {
			return true;
		}
	}

}
