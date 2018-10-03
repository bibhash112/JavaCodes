package com.bibhash.bank;

public class customer {

	public static void main(String[] args) {
		/*//BankAccount acc1=new BankAccount();
		BankAccount acc2=new SavingsAccount("Bibhash",50000);
		System.out.println(acc1.toString());
		acc2.withdraw(100);
		acc2.deposit(100);
		System.out.println(acc2.toString());
		acc2.withdraw(100);
		System.out.println(acc2.toString());*/
		SavingsAccountVersion2 acc3=new SavingsAccountVersion2("Bibhash",5000);
		System.out.println(acc3.getInsuranceName());
	
	}
}
