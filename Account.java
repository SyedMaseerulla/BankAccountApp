package bankAcc.App;

public abstract class Account implements IBaseRate{

	//list common properties for savings and checking acc
		private String name;
		private String ssn;
		private double balance;
		private static int index = 10000;
		protected String accNumber;
		protected double rate;
		
	//constructor to set base properties and initialize acc.
	public Account(String name, String ssn, double initDeposit){
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		index++;
		this.accNumber = setAccountNumber();
		setRate();
	
	}
	public abstract void setRate();
	//set account no.
	private String setAccountNumber(){
		String lastTwoOfSsn = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn + uniqueID + randomNumber;
	}
	
	public void compound(){
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
	}
	
	//list common methods
	public void deposit(double amount){
		balance = balance + amount;
		System.out.println("Depositing the amount...");
		printBalance();
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
		System.out.println("Withdrawing the amount...");
		printBalance();
	}
	public void transfer(String towhere, double amount){
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + towhere);
		printBalance();
	}
	public void printBalance(){
		System.out.println("Your Balance is now: " + balance);
	}
	
	public void showInfo(){
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accNumber +
				"\nBalance: " + balance + "\nRate: " + rate + "%");
	}
}
