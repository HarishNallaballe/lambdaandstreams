package com.functionalInterface.realworld;

public interface AccountFactory {

	public abstract BankAccount getBankAccount(int id,double balance,String accountName);
	
}
