package bankAcc.App;

public abstract class Account implements IBaseRate{

	//list common properties for savings and checking acc
		String name;
		String ssn;
		double balance;
		
		String accNumber;
		double rate;
		
	//constructor to set base properties and initialize acc.
	public Account(String name, String ssn, double initDeposit){
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		System.out.println("name: " + name + "ssn: " + ssn + "balance: $" + balance);
	}
	//list common methods
}
