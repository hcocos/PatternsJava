package decoratorClasses;

import componentClasses.Component;

public class ConcreteDecoratorC extends Decorator{

	// store the component object
	public ConcreteDecoratorC(Component component) {
		super(component);
	}
	
	// operate with extened behavior
	public void operate() {
		component.operate();
		System.out.println("DecoratorC operated on Component and added a behavior:"+addedBehavior());
	}
	
	// add a behavior to the Component object
	public String addedBehavior() {
		return "\n\nHi I have added some behavior to the Component!!!";
	}
}
