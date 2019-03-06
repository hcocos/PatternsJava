
public class DepositCommand implements Command {

	BankAccount account;
	
	// The Constructor is setting the local account for the Command
	public DepositCommand(BankAccount account)
	{
		this.account = account;
	}
	
	// The execute Command is incrementing the balance
	public void execute()
	{
		account.incrementAccount();
	}
	
	// The undo Command is doing the opposite of the execute()
	public void undo()
	{
		account.decrementAccount();
	}
	
}
