package conreteFactoryClasses;

import concreteProductClasses.ConcreteProduct1B;
import concreteProductClasses.ConcreteProduct2B;
import concreteProductClasses.ConcreteProduct3B;
import vanillaAbstractFactory.AbstractFactory;
import vanillaAbstractFactory.Product1;
import vanillaAbstractFactory.Product2;
import vanillaAbstractFactory.Product3;

//The Concrete Class implementing the Abstract Factory Interface
//This Concrete Factory is a Singleton with Thread Safe Lazy Loading
public class ConcreteFactoryB implements AbstractFactory {

	private static ConcreteFactoryB instance;

	private ConcreteFactoryB() {
		System.out.println("Instance of Concrete Factory B was created!");
	}

	// This instance creation is Thread safe!!!
	public static ConcreteFactoryB getInstance() {
		if (instance == null) {
			synchronized (ConcreteFactoryB.class) {
				if (instance == null) {
					instance = new ConcreteFactoryB();
				} else {
					System.out.println("There already is an instance of Concrete Factory B!");
				}
			}

		} else {
			System.out.println("There already is an instance of Concrete Factory B!");
		}
		return instance;
	}

	@Override
	public Product1 createProduct1() {
		// TODO Auto-generated method stub
		return new ConcreteProduct1B();
	}

	@Override
	public Product2 createProduct2() {
		// TODO Auto-generated method stub
		return new ConcreteProduct2B();
	}

	@Override
	public Product3 createProduct3() {
		// TODO Auto-generated method stub
		return new ConcreteProduct3B();
	}

}