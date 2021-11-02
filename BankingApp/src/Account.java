/*
 *Program created by: Hussein Alsowadi
 *the base account class 
 */
public class Account {

	//variables that will be inherted for classes 
	protected double balance;		//account number 
	private String name;		//name on account
	private int accountnum;	//account balance
	private static int numWithdrawls=0;	//number of withdrawls
	private static int numDeposits=0;		//number of deposits



	//no-args constructor 

	public Account() 
	{
		this.balance = 0;
		this.name = "";
		this.accountnum = 00000;
	}

	public Account (double balance, String name, int accountnum) {
		this.name=name;
		this.balance = balance;
		this.accountnum = accountnum;
	}

	//deposit/withdrawl
	public void Withdrawl(double amount) {
		balance=balance-amount;
		numWithdrawls++;	
		
	}
	public void Deposit(double amount) {
		balance=balance+amount;
		numDeposits++;
	}
	
	public void Transfer(Account FromAccount, Account ToAccount, int total) {
		
		if(FromAccount.getBalance() >= total) {
			//remove amount from account your transfer from 
			FromAccount.Withdrawl(total);
			ToAccount.Deposit(total);
			
		}
		else System.out.println("Your Broke bro");
		
	}
	
	//getters
	
	public  double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public long getAccountnum() {
		return accountnum;
	}
	
	public static int getNumWithdrawls() {
		return numWithdrawls;
	}
	public static int getNumDeposits() {
		return numDeposits;
	}
	
	//toString
	public String toString()
	  {
	      return ("Name: " + name + "\nAccount Number: " + accountnum + "\nBalance: $" + balance +"\nNumber of Withdrawls: " + numWithdrawls + "\nNumber of Deposits: " + numDeposits);



	}



}