package vanillaObserver;

// Implement the Observer Interface
public class ConcreteObserverA implements Observer {

	// An instance of Concrete Subject and an observerState
	private ConcreteSubject subject;
	private int observerState;

	// Initialize Subject attribute in Constructor
	public ConcreteObserverA(ConcreteSubject subject) {
		this.subject = subject;
	}

	@Override
	public void updateObserver() {
		// TODO Auto-generated method stub

		observerState = subject.getState();
		System.out.println("Updated Observer A with state: " + observerState);
	}

}
