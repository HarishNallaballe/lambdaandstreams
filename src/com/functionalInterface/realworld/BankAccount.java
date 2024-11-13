package com.functionalInterface.realworld;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

//we will implwmwnt a real world bank bank problem using lambdas
// the example will transfer money from student bank to university bank account. it will run 20 transactions using threads
public class BankAccount{
	
	private Integer id;
	private Double balance;
	private String accountName;
	final Lock lock=new ReentrantLock();
	
	BiFunction<Double, Double, Double> sub=(a,b)->a-b;
	BiFunction<Double, Double, Double> add=(a,b)->a+b;
	
	public Boolean withdraw(Double amount) throws InterruptedException {
		if(this.lock.tryLock()) {
			Thread.sleep(100);
			balance=sub.apply(balance, amount);
			this.lock.unlock();
			return true;
		}
		return false;
	}
	
	public Boolean transfer(BankAccount to,double amount) throws InterruptedException {
		if(withdraw(amount)) {
			System.out.println("Withdrawing amount "+amount+" from"+getAccountName());
			if(to.deposit(amount)) {
				System.out.println("Deposit Amount "+amount+" to "+to.getAccountName());
				return true;
			}else {
				System.out.println("Deposit failed");
				while(deposit(amount)) {
					continue;
				}
			}
		}
		return false;
	}
	
	public Boolean deposit(double amount) throws InterruptedException {
		if(this.lock.tryLock()) {
			Thread.sleep(100);
			balance = add.apply(balance, amount);
			this.lock.unlock();
			return true;
		}
		return false;
	}
	
	public BankAccount(Integer id,Double balance,String accountName) {
		this.id=id;
		this.balance=balance;
		this.accountName=accountName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", balance=" + balance + ", accountName=" + accountName + "]";
	}
	
	
	
}
