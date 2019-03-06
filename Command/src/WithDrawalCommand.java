
public class WithDrawalCommand implements Command{

	BankAccount account;
	
	// The Constructor is setting the local account for the Command
	public WithDrawalCommand(BankAccount account)
	{
		this.account = account;
	}
	
	// The execute Command is decrementing the balance
	public void execute()
	{
		account.decrementAccount();
	}
	
	
	// The undo Command is doing the opposite of the execute()
	public void undo()
	{
		account.incrementAccount();
	}
	
}
