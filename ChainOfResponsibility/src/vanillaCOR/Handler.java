package vanillaCOR;

// Abstract Handler Class
public abstract class Handler {

	// Abstract methods interface for the Concrete Handlers
	public abstract void setHandler(Handler nextHandler);
	
	public abstract void handleRequest(Number number);
	
}
