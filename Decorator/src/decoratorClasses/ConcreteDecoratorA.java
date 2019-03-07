package decoratorClasses;

import componentClasses.Component;

public class ConcreteDecoratorA extends Decorator {

	// store the component object
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	// operate on the Decorator
	public void operate() {
		component.operate();
		System.out.println("DecratorA operated on Component!");
	}

}
