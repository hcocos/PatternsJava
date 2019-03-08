package conreteFactoryClasses;

import concreteProductClasses.ConcreteProduct1A;
import concreteProductClasses.ConcreteProduct2A;
import concreteProductClasses.ConcreteProduct3A;
import vanillaAbstractFactory.AbstractFactory;
import vanillaAbstractFactory.Product1;
import vanillaAbstractFactory.Product2;
import vanillaAbstractFactory.Product3;

//The Concrete Class implementing the Abstract Factory Interface
//This Concrete Factory is a Singleton with Lazy Loading
public class ConcreteFactoryA implements AbstractFactory {

	private static ConcreteFactoryA instance;

	private ConcreteFactoryA() {
		System.out.println("Instance of Concrete Factory A was created!");
	}

	// This instance creation is using Lazy Loading
	public static ConcreteFactoryA getInstance() {
		if (instance == null) {
			instance = new ConcreteFactoryA();
		} else {
			System.out.println("There already is an instance of Concrete Factory A!");
		}
		return instance;
	}

	@Override
	public Product1 createProduct1() {
		// TODO Auto-generated method stub
		return new ConcreteProduct1A();
	}

	@Override
	public Product2 createProduct2() {
		// TODO Auto-generated method stub
		return new ConcreteProduct2A();
	}

	@Override
	public Product3 createProduct3() {
		// TODO Auto-generated method stub
		return new ConcreteProduct3A();
	}

}
