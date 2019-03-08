
import componentClasses.Component;
import componentClasses.ConcreteComponentA;
import componentClasses.ConcreteComponentB;
import decoratorClasses.ConcreteDecoratorA;
import decoratorClasses.ConcreteDecoratorB;
import decoratorClasses.ConcreteDecoratorC;

public class Client {

	public static void main(String[] args) {

		// Creating a Component object and afterwards adding Decorators
		Component componentA = new ConcreteComponentA();
		componentA.operate();

		componentA = new ConcreteDecoratorA(componentA);
		componentA.operate();

		componentA = new ConcreteDecoratorB(componentA);
		componentA.operate();

		componentA = new ConcreteDecoratorC(componentA);
		componentA.operate();

		// Encapsulate an component object with multiple Decorators
		Component componentB = new ConcreteDecoratorA(
				new ConcreteDecoratorB(new ConcreteDecoratorC(new ConcreteComponentB())));
		componentB.operate();

		/*
		 * // Going nuts!!! Component componentC = new ConcreteDecoratorA( new
		 * ConcreteDecoratorB( new ConcreteDecoratorC( new ConcreteDecoratorC( new
		 * ConcreteDecoratorB( new ConcreteDecoratorA( new ConcreteDecoratorA( new
		 * ConcreteDecoratorB( new ConcreteDecoratorC( new ConcreteDecoratorC( new
		 * ConcreteDecoratorB( new ConcreteDecoratorA( new
		 * ConcreteComponentB())))))))))))); componentC.operate();
		 */
	}

}
