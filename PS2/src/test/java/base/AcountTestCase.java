package base;

import org.junit.Test;
import base.InsufficientFundsException;

public class AcountTestCase {
	Account test = new Account(1122, 2000.0);	

	@Test
	public void test() {
		test.setId(1122);
		test.setBalance(20000.0);
		test.setAnnuallnterestRate(0.045);
		test.withdraw(2500.0);
		test.deposit(3000.0);
		System.out.println("Your balance is: "+ test.getBalance()+ ", monthly interest: " + 
				test.getMonthlyInterestRate()*100 + "% and the date of the account created: "+ test.getDateCreated());
	}
	// Exception Test
	@Test(expected = InsufficientFundsException.class)
	public void OverDraw() throws InsufficientFundsException{
		test.withdraw(50000.0);	
		
	}
}
