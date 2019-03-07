package vanillaStrategy;

public class Client {

	public static void main(String[] args) {

		Strategy strategy1 = new ConcreteStrategy1();
		Strategy strategy2 = new ConcreteStrategy2();

		strategy1.operation();
		strategy2.operation();

	}

}
