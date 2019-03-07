package vanillaCommand;
import java.util.ArrayList;
import java.util.List;

public class Invoker {

	// List of Command objects in Invoker
	private List<Command> commands = new ArrayList<Command>();
	private Command lastCommand;

	// Set Command in List of Commands
	public void setCommand(Command command) {
		commands.add(command);
	}

	// execute the commands in the Invoker
	public void execute(int i) {

		commands.get(i).execute();
		lastCommand = commands.get(i);
	}

	// undo the commands in the Invoker
	public void undo(int i) {

		commands.get(i).undo();

		if (lastCommand != null) {
			lastCommand = null;
		}
	}

}
