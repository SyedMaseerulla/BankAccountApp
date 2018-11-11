package bankAcc.App;

public interface IBaseRate {

	//write a method which returns base rate
	 default double getBaseRate(){    /*Please note that default access specifier in 
		                              interface works only in Java8 and above*/
		 return 2.5;
	}
}
