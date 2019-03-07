
// Implement the Observer Interface
public class ConcreteObserverB implements Observer {

	// An instance of Concrete Subject and an observerState
	private ConcreteSubject subject;
	private int observerState;

	// Initialize Subject attribute in Constructor
	public ConcreteObserverB(ConcreteSubject subject) {
		this.subject = subject;
	}

	@Override
	public void updateObserver() {

		observerState = subject.getState();
		// TODO Auto-generated method stub
		System.out.println("Updated Observer B with state: " + observerState);
	}

}
