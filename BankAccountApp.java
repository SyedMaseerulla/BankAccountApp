package bankAcc.App;

public class BankAccountApp {

	public static void main(String[] args) {

		Checking chk1 = new Checking("Tim Cook","25467852", 1500);
		
		Savings sav1 = new Savings("James Brown","587231698", 2400);
		//read a csv file then decide the acc to create based on the data
		chk1.showInfo();
		System.out.println("******************************************************");
		sav1.showInfo();
		
	}

}
