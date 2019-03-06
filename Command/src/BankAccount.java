
public class BankAccount {
	
	private int balance;
	
	
public BankAccount(int balance)
{
	this.balance = balance;
}
	
public int getBalance()
{
	return this.balance;
}

	
public void incrementAccount()
{
	this.balance = this.balance+100;
	System.out.println("The Balance was increased by 100!");
}

public void decrementAccount()
{
	this.balance = this.balance-100;
	System.out.println("The Balance was decreased by 100!");
}

}
