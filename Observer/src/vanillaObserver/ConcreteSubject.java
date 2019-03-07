package vanillaObserver;

public class ConcreteSubject extends Subject {

	private int state;

	public void setState(int state) {

		this.state = state;

		notifyObservers(state);
	}

	public int getState() {

		return state;
	}

}
