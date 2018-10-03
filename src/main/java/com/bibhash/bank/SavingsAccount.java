package com.bibhash.bank;

public class SavingsAccount extends BankAccount{
	double minBalance;
	
	{
		minBalance=1000;
	}
	
	
	public SavingsAccount(String accountHolderName, double accountBalance) {
		super();
	}
	@Override
	public void withdraw(double amount)
	{
		if(this.accountBalance-(amount)>=minBalance)
		accountBalance-=amount;
		else
			System.out.println("Transaction Declined");
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}

}
