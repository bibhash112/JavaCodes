package com.bibhash.bank;

public class SavingsAccountVersion2 extends SavingsAccount implements Insurance{
	

	public SavingsAccountVersion2(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	
	}
	public String getInsuranceName() {
		return "BhartiAXA";
	}
     public int getDuration() {
		return 10;
	}
     public double getPremium() {
    	return 100.40;
    }
}
