package base;

import org.junit.Before;
import org.junit.Test;

public class AcountTestCase {
	Account test = new Account(1122, 20000);
	
	@Before
	public void setup() {
		test.setId(1122);
		test.setBalance(20000.0);
		test.setAnnuallnterestRate(0.045);		
	}

	@Test
	public void testcase() throws InsufficientFundsException {
		test.withdraw(2500.0);
		test.deposit(3000.0);
		System.out.println(
				"Your balance is: " + test.getBalance() + ", monthly interest: " + test.getMonthlyInterestRate() * 100
						+ "% and the date of the account created: " + test.getDateCreated());
	}
	// Exception Test
	@Test(expected = InsufficientFundsException.class)
	public void OverDraw() throws InsufficientFundsException {
		test.withdraw(50000.0);

	}
}
