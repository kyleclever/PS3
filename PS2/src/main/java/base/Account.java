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
	 * The accessor and mutator methods for id, balance, and annualInterestRate.
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
	 * The accessor method for dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annuallnterestRate / 12;
		return monthlyInterestRate;
	}

	public void withdraw(double withdrawAmount) {
		balance = balance - withdrawAmount;
	}

	// public void withdraw(double withdrawAmount) throws
	// InsufficientFundsException {
	// if (withdrawAmount < balance)
	// throw new InsufficientFundsException('Insufficient Balance');
	// else
	// balance = balance - withdrawAmount;
	// }

	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}

}
