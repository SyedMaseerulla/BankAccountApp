package bankAcc.App;

public abstract class Account implements IBaseRate{

	//list common properties for savings and checking acc
		String name;
		String ssn;
		double balance;
		static int index = 10000;
		String accNumber;
		double rate;
		
	//constructor to set base properties and initialize acc.
	public Account(String name, String ssn, double initDeposit){
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		index++;
		this.accNumber = setAccountNumber();
		
	}
	//set account no.
	private String setAccountNumber(){
		String lastTwoOfSsn = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn + uniqueID + randomNumber;
	}
	
	//list common methods
	public void showInfo(){
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accNumber +
				"\nBalance: " + balance);
	}
}
