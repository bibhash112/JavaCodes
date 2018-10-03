package com.bibhash.bank;

public class CurrentAccountVersion2 extends CurrentAccount implements Insurance {
	
	
	public CurrentAccountVersion2(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	}
	public String getInsuranceName() {
		return "LIC";
	}
     public int getDuration() {
		return 100;
	}
     public double getPremium() {
    	return 200.40;
    }

}
