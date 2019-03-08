package vanillaCOR;

public class Client {

	public static void main(String[] args) {

		// Inititialize Handlers
		Handler handler1 = new NegativeNumberHandler();
		Handler handler2 = new PositiveNumberHandler();
		Handler handler3 = new ZeroNumberHandler();

		// set the Chain of Handlers
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		
		// Handler request by the Chain of Responsibility
		handler1.handleRequest(new Number(100));
		handler1.handleRequest(new Number(-100));
		handler1.handleRequest(new Number(0));
		handler1.handleRequest(new Number(1));
		handler1.handleRequest(new Number(2));
		handler1.handleRequest(new Number(-2));
		handler1.handleRequest(new Number(-3));
		handler1.handleRequest(new Number(-11));
		handler1.handleRequest(new Number(0));
		handler1.handleRequest(new Number(20));
		
	}

}
