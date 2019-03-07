package vanillaComposite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	// Aggregate object of Component objects
	private List<Component> composite = new ArrayList<Component>();

	// Implementation of the operate method
	public void operate() {

		for (Component component : composite) {
			component.operate();
		}
		System.out.println("Operation on Composite!");
	}

	// Specialized Implementation of Default Implementations
	public void add(Component component) {

		composite.add(component);
	}

	public void remove(Component component) {

		composite.remove(component);
	}

	public Component getChild(int i) {
		return composite.get(i);
	};

}
