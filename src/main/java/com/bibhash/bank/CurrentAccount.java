package com.bibhash.bank;

public class CurrentAccount extends BankAccount{
	int accountNo;
	String accountHolderName;
	double accountBalance;
	double odLimit;
	static int autoAccountNoGen;
	
	public CurrentAccount(String accountHolderName, double accountBalance) {
		super();
	}
	
	{
		accountNo=++autoAccountNoGen;
		odLimit=5000;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}
	
	public void withdraw(double amount)
	{
		if(amount<odLimit)
			accountBalance-=amount;
		else
			System.out.println("Transaction Declined");
	}

	
}
