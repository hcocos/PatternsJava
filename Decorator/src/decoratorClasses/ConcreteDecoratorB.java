package decoratorClasses;

import componentClasses.Component;

public class ConcreteDecoratorB extends Decorator{

	// add a state to the Decorator
	private int state;
	
	// store the component object and set state
	public ConcreteDecoratorB(Component component) {
		super(component);
		state=42;
	}
	
	// operate with extended state
	public void operate() {
		component.operate();
		System.out.println("DecoratorB operated on Component and added a State:"+state+"");
	}
}
