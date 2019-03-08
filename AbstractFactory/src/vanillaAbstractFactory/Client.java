package vanillaAbstractFactory;

import javax.xml.parsers.FactoryConfigurationError;

import conreteFactoryClasses.ConcreteFactoryA;
import conreteFactoryClasses.ConcreteFactoryB;

// Client Method using the Abstract Factory to create objects
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String os = System.getProperty("os.name");

		// Check if OS is Linux else use Factory B
		if (os.equals("Mac")) {
			AbstractFactory factoryA = ConcreteFactoryA.getInstance();
			System.out.println("Creating the objects for Abstract Factory A!");
			Product1 product1A = factoryA.createProduct1();
			Product2 product2A = factoryA.createProduct2();
			Product3 product3A = factoryA.createProduct3();
			AbstractFactory nextFactoryA = ConcreteFactoryA.getInstance();
		} else {
			AbstractFactory factoryB = ConcreteFactoryB.getInstance();
			System.out.println("\nCreating the objects for Abstract Factory B!");
			Product1 product1B = factoryB.createProduct1();
			Product2 product2B = factoryB.createProduct2();
			Product3 product3B = factoryB.createProduct3();
			AbstractFactory nextFactoryB = ConcreteFactoryB.getInstance();
		}

	}

}
