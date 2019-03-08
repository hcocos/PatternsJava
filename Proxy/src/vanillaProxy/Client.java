package vanillaProxy;

public class Client {

	public static void main(String[] args) {

		Subject proxy = new Proxy();
		VirtualProxy virtualProxy = new VirtualProxy();
		proxy.request();
		System.out.println("The Virtual Proxy has an instance of RealSubject: " + virtualProxy.isRealSubject());
		virtualProxy.request();
		System.out.println("The Virtual Proxy has an instance of RealSubject: " + virtualProxy.isRealSubject());
	}

}
