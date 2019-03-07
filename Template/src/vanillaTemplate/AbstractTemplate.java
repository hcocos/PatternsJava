package vanillaTemplate;

public abstract class AbstractTemplate {

	// The template method
	public final void templateMethod() {

		System.out.println("This is the template method and these are the hook methods: ");
		primitiveMethod1();
		primitiveMethod2();
	}

	// Abstract primitive method
	public abstract void primitiveMethod1();

	// Abstract primitive method
	public abstract void primitiveMethod2();

}
