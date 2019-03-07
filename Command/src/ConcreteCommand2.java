
public class ConcreteCommand2 implements Command {

	// Receiver object and state
	private Receiver receiver;
	private boolean commandState = true;

	// set Receiver object in Constructor
	public ConcreteCommand2(Receiver receiver) {

		this.receiver = receiver;
	}

	// execute action 2 on receiver
	public void execute() {

		receiver.action2();
	}

	// undo the last command
	public void undo() {

		if (commandState == false) {
			commandState = true;
		} else {
			commandState = false;
		}
		System.out.println("The Command 2 was undone: " + commandState);

	}

}
