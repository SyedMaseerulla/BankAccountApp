package bankAcc.App;

public class Checking extends Account{

	//list properties specific to checking acc.
	int debitCardNumber;
	int debitCardPin;
	
	//initialize constructor to check acc properties
	public Checking(String name, String ssn, double initDeposit){
		super(name, ssn, initDeposit);
		System.out.println("New Checking account");
		
	}
	//list any methods specific to checking acc.
}
