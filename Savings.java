package bankAcc.App;

public class Savings extends Account{
	
	//list properties specific to savings acc.
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
		//initialize constructor to check savings acc properties
		public Savings(String name, String ssn, double initDeposit){
			super(name, ssn, initDeposit);
			accNumber = "1" + accNumber;
			safetyDepositBox();
		}
		@Override
		public void setRate(){
			rate = getBaseRate() - 0.25;
		}
		//list any methods specific to savings acc.
		public void safetyDepositBox(){
			this.safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
			this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		}
		public void showInfo(){
			super.showInfo();
			System.out.println("YOUR SAVINGS ACCOUNT FEATURES: ");
			System.out.println("\n  Safety deposit box id: " + safetyDepositBoxId + 
					"\n  Safety deposit box key: " + safetyDepositBoxKey);
		}


}
