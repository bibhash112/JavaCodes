package com.bibhash.bank;
/** this comment is for documentation
 * 
 * @author bibsaha
 * @since 03-10-2018
 */

abstract public class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	{
		accountNo=++autoAccountNoGen;
	}
	
	public BankAccount()
	{
		
		accountHolderName="Unknown";
		accountBalance=0;
	}
	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public abstract void withdraw(double amount);
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	
	


	
	

}
 


