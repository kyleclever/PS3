package base;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annuallnterestRate = 0.0;
	private Date dateCreated = new Date();

	/**
	 * A no-arg constructor that creates a default account.
	 */
	public Account() {
	}

	/**
	 * A constructor that creates an account with the specified id and initial
	 * balance.
	 */
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	/**
	 * The accessory and mutator methods for id, balance, and
	 * annualInterestRate.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}

	/**
	 * The accessory method for dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annuallnterestRate / 12;
		return monthlyInterestRate;
	}

	/**
	 * @param withdrawAmount
	 * @throws InsufficientFundsException
	 */
	public void withdraw(double withdrawAmount) throws InsufficientFundsException {

		if (withdrawAmount > balance) {
			System.out.println("Sorry, you have a insufficient balance");
			throw new InsufficientFundsException(withdrawAmount);

		} else {
			balance = balance - withdrawAmount;
		}
	}

	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}

}
