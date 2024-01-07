package com.abstractb;

abstract class BankAccount {
	
	protected double balance;
	
	public BankAccount(double balance) {
		this.balance=balance;
	}
	
	abstract void deposite(double amount);
	abstract void withdraw(double amount);

}

class SavingAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingAccount(double balance , double interestRate) {
		super(balance);
		this.interestRate=interestRate;
	}

	@Override
	void deposite(double amount) {
		balance+=amount;
		System.out.println("Deposit of $ "+amount+ " into SavingAccount Current balance: $" +balance);
	
	}

	@Override
	void withdraw(double amount) {
	if(amount<=balance) {
		balance-=amount;
		System.out.println("Withdraw of $ "+amount+ " from savingAccount current balance:$"+balance);
		
	}else {
		System.out.println("SavingAccount withdraw is failed!!");
	}
	
	 
	}
	
}

class CurrentAccount extends BankAccount{
	
	private double overdraftLimit;
	
	public CurrentAccount(double balance, double overdraftLimit) {
		  super(balance);
	        this.overdraftLimit = overdraftLimit;
	}
	

	@Override
	void deposite(double amount) {
	
		 balance += amount;
	        System.out.println("Deposit of $" + amount + " into CurrentAccount. Current balance: $" + balance);
	}

	@Override
	void withdraw(double amount) {
		double availableFunds = balance + overdraftLimit;
        if (amount <= availableFunds) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " from CurrentAccount. Current balance: $" + balance);
        } else {
            System.out.println(" CurrentAccount Withdrawal failed.");
        }
	}
	
}

public class Bankk {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CurrentAccount
        SavingAccount sa = new SavingAccount(1000, 0.05);
        CurrentAccount ca = new CurrentAccount(2000, 500);

        // Performing operations on SavingsAccount
        sa.deposite(5000);
        sa.withdraw(2000);

        // Performing operations on CurrentAccount
        ca.deposite(5000);
        ca.withdraw(3000);
    }
}
