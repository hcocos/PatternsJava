package vanillaComposite;

public class Client {

	public static void main(String[] args) {

		Component composite1 = new Composite();
		Component composite2 = new Composite();
		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		
		composite2.add(leaf1);
		composite2.add(leaf2);
		composite1.add(composite2);
		composite1.operate();
		
		
	}
}