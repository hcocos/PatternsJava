package vanillaCommand;

public class ConcreteCommand1 implements Command {

	// Receiver object and state
	private Receiver receiver;
	private boolean commandState = true;

	// set Receiver object in Constructor
	public ConcreteCommand1(Receiver receiver) {

		this.receiver = receiver;
	}

	// execute action 1 on receiver
	public void execute() {

		receiver.action1();
	}

	// undo the last command
	public void undo() {

		if (commandState == false) {
			commandState = true;
		} else {
			commandState = false;
		}
		System.out.println("The Command 1 was undone: " + commandState);
	}

}
