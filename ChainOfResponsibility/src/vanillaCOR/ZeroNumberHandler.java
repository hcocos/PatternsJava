package vanillaCOR;

// This Concrete Handler is handling zero values
public class ZeroNumberHandler extends Handler {

	// Reference to the next Handler
	private Handler nextHandler;

	// setter for the next Handler in the Chain
	public void setHandler(Handler nextHandler) {

		this.nextHandler = nextHandler;
	}

	// handle the reuqest for zero values
	public void handleRequest(Number number) {

		if (number.getNumber() == 0) {

			System.out.println("Handler for Zeros: " + number.getNumber());
		} else {
			System.out.println("Next Handler in chain!");
			nextHandler.handleRequest(number);
		}

	}

}