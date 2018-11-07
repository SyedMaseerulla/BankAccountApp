package bankAcc.App;

public class Savings extends Account{
	
	//list properties specific to savings acc.
		int safetyDepositBoxId;
		int safetyDepositBoxKey;
		//initialize constructor to check savings acc properties
		public Savings(String name, String ssn, double initDeposit){
			super(name, ssn, initDeposit);
			System.out.println("New Savings account");
		}
		//list any methods specific to savings acc.

}
