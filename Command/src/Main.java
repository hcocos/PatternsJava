
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BankAccount account = new BankAccount(1000);
		
		Command income = new DepositCommand(account);
		Command outcome = new WithDrawalCommand(account);
	
		System.out.println("The current Balance: "+account.getBalance());
		
		income.execute();
		income.execute();
		System.out.println("The current Balance: "+account.getBalance());
		outcome.execute();
		outcome.execute();
		outcome.execute();
		System.out.println("The current Balance: "+account.getBalance());
		
		
	}

}
