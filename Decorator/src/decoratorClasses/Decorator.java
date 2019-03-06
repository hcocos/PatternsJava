package decoratorClasses;

import componentClasses.Component;

// Definition of the abstract Decorator class
// The Decorator is extending the Component class 
// Additionally an component object is stored inside the Decorator
public abstract class Decorator extends Component{

	// Component object 
	protected Component component;
		
	// Constuctor of Decorator setting the component attribute
	// This makes working with the Decorator easier
	public Decorator(Component component) {
		
		this.component = component;
	}
	
}
