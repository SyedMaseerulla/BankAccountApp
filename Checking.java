package bankAcc.App;

public  class Checking extends Account{

	//list properties specific to checking acc.
	private int debitCardNumber;
	private int debitCardPin;
	
	//initialize constructor to check acc properties
	public Checking(String name, String ssn, double initDeposit){
		super(name, ssn, initDeposit);
		accNumber = "2" + accNumber;	
		setDebitCard();
	}
	@Override 
	public void setRate(){
		rate = getBaseRate() * 0.15; 
	}
	//list any methods specific to checking acc.
	public void setDebitCard(){
		this.debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("YOUR CHECKING ACCOUNT FEATURES");
		System.out.println("\n  Debit card number is: " + debitCardNumber + 
				"\n  Debit card pin is: " + debitCardPin);
	}
}
