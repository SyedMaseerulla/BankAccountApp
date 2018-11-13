package bankAcc.App;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List <Account> accounts = new LinkedList <Account>(); //creating list of objects
		
		//read a csv file then decide the acc to create based on the data
		
		String file = "F:\\Documents\\JavaProject\\NewBankAccounts.csv";
		List<String[]> NewAccountHolders = utilities.CSV.read(file); //calling the csv file from utilities package to read the csv file
		
		for (String[] accountHolder : NewAccountHolders) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
	
			if(accountType.equalsIgnoreCase("savings")){
				//System.out.println(" OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, ssn, initDeposit));
			}
			else if(accountType.equalsIgnoreCase("checking")){
				//System.out.println(" OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else{
				System.out.println("ERROR IN OPENING ACCOUNT");
			}
		}
		for (Account acc : accounts) {
			acc.showInfo();
			System.out.println("\n************************************************");
		}
	}
 
}
