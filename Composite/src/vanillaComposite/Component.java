package vanillaComposite;

public abstract class Component {

	// Abstract operate method
	public abstract void operate();

	// Default implementations for transparency
	public void add(Component component) { }

	public void remove(Component component) { }

	public Component getChild(int i) {return null;};

}
