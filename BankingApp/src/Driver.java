import java.util.*;

class Driver {

	public static void main(String[] args) {
	
		ArrayList<Account> AccountList = new ArrayList<>();			//list of accounts, not the best of ideas but well make a db later 
		
		AccountList.add(new Account(1000, "John Allen",1));
		AccountList.add(new Account(1000, "Adam Mayhem",2));
		AccountList.add(new Account(1000, "Tristian AI",3));
		AccountList.add(new Account(1000, "Matthew Eett",4));
		AccountList.add(new Account(1000, "Ryan Mckenny",5)); 
		
		AccountList.add(new Account(1000, "Spencer Game",6));
		AccountList.add(new Account(1000, "John Figer",7));
		AccountList.add(new Account(1000, "Josh Allen",8));
		AccountList.add(new Account(1000, "Mariana Allison",9));
		AccountList.add(new Account(1000, "Ayana Nickoles",10));
	
		double total=0;
		for (int i=0; i<AccountList.size(); i++) {
			
		 total += AccountList.get(i).getBalance();
			
		}
		
		System.out.println("The total of all the accounts is : " +total);
		
	
		
		
		System.out.println("Balance before transfer: "+AccountList.get(1).getBalance());
		AccountList.get(1).Transfer(AccountList.get(1), AccountList.get(2),1500);
		System.out.println("Balance after Transfer:" + AccountList.get(1).getBalance());
		System.out.println("Blance of account that recieved Transfer"+ AccountList.get(2).getBalance());
		
		
		
		
		/*
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome new User! Begin by entering in your name");
		String name=kb.nextLine();
		System.out.println("Enter in your balance");
		double balance= kb.nextDouble();
		System.out.println("Finally enter in your account number");
		int AccountNum =kb.nextInt();
		Account myChecking = new Account(balance,name, AccountNum);

*/

/*

		System.out.println("\n Welcome " + name +" Below is an overview of your account \n");
		System.out.println(myChecking.toString());

		int option;
*/
/*
		do
		{
			//menu

			System.out.println();
			System.out.println("Please enter in the number of the option you would like to use");
			
			System.out.println(" 1. View account information");
			System.out.println(" 2. Make a deposit");
			System.out.println(" 3. Make a withdrawl");
			System.out.println(" 4. number of withdrawls");
			System.out.println(" 5. number of deposits");
			System.out.println(" 6. Exit");
			option =kb.nextInt();
			

			switch(option) {

			case 1:

				System.out.println("\t" + myChecking.toString());
				break;

			case 2:
				System.out.println("Enter in depsoit amount:");
				double depositAmount= kb.nextDouble();
				//call on deposit method
				myChecking.Deposit(depositAmount);

				break;

			case 3:
				System.out.println("Enter in withdrawl amount");

				//if else statment to see if you have enough to make withdrawl. 
				double withdrawlAmount=kb.nextDouble();
				if (balance < withdrawlAmount) {
					System.out.println("inceifcent funds");
				}
				else {
					//call on withdrawl method
					myChecking.Withdrawl(withdrawlAmount);			
				}

				break;
			case 4:
				System.out.println("number of withdrawls: " +myChecking.getNumWithdrawls());
				break;
			case 5:
				System.out.println("number of deposits: "+myChecking.getNumDeposits());
				break;

			case 6:
				System.out.println("Have a great day!");
				break;
			default:
				System.out.println("invlaid option");
				break;
			}


		}while(option !=6);	
*/
	}

}
