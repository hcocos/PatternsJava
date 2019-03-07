package vanillaObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private final List<Observer> observerList = new ArrayList<Observer>();

	// Attach the observers in List
	public void attach(Observer aObserver) {

		observerList.add(aObserver);
	}

	// Remove the observers from List
	public void detach(Observer aObserver) {

		observerList.remove(aObserver);
	}

	// Notify All observers
	protected void notifyObservers(int state) {

		for (Observer observer : observerList) {

			observer.updateObserver();
		}

	}
}
