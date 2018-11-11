package bankAcc.App;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		/*Checking chk1 = new Checking("Tim Cook","25467852", 1500);
		Savings sav1 = new Savings("James Brown","587231698", 2400);
		sav1.compound();
		chk1.showInfo();
		System.out.println("******************************************************");
		sav1.showInfo();
		sav1.deposit(5000);
		sav1.withdraw(4000);
		sav1.transfer("Vodafone pvt.ltd.", 300);*/
		
		//read a csv file then decide the acc to create based on the data
		String file = "F:\\Documents\\JavaProject\\NewBankAccounts.csv";
		List<String[]> NewAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : NewAccountHolders) {
			System.out.println("NEW ACCOUNT ");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
		}
	}
 
}
