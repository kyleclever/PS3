package base;

import java.io.*;
/**
 * Custom class for throwing an insufficient funds exception
 */
public class InsufficientFundsException extends Exception {
	private double amount;

	/**
	 * Create an instance of the InsufficientFundsException class, to be thrown
	 * to the caller
	 */
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

//	Account test = new Account();
//
//	public void withdraw(double withdrawAmount) throws InsufficientFundsException {
//		if (withdrawAmount < test.getBalance()) {
//			throw new InsufficientFundsException(withdrawAmount);
//		}

	}

