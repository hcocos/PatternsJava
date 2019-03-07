
public class Client {

	public static void main(String[] args) {

		// Initialize Receiver, Command and Invoker objects
		Receiver receiver = new Receiver();
		Command command1 = new ConcreteCommand1(receiver);
		Command command2 = new ConcreteCommand2(receiver);
		Invoker invoker = new Invoker();

		// execute and undo simple commands
		command1.execute();
		command2.execute();
		command1.undo();
		command2.undo();

		// Set commands in Invoker
		invoker.setCommand(command2);
		invoker.setCommand(command1);

		// execute and undo commands in Invoker
		invoker.execute(0);
		invoker.execute(1);
		invoker.undo(0);
		invoker.undo(1);

	}

}
