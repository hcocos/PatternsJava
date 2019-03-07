
public class Client {

	public static void main(String[] args) {

		AbstractTemplate concreteObject1 = new ConcreteClass1();
		AbstractTemplate concreteObject2 = new ConcreteClass2();

		concreteObject1.templateMethod();
		concreteObject2.templateMethod();

	}

}
