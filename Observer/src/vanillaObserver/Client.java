package vanillaObserver;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating Instances of the Concrete Subject and the Observers
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserverA observerA = new ConcreteObserverA(subject);
		ConcreteObserverB observerB = new ConcreteObserverB(subject);

		// Attach the Observers to the subject object
		subject.attach(observerA);
		subject.attach(observerB);

		// Change the state of the subject
		subject.setState(42);

		// Detach the Observers and test their behavior
		subject.detach(observerA);
		subject.setState(43);
		subject.detach(observerB);
		subject.setState(44);

	}

}
