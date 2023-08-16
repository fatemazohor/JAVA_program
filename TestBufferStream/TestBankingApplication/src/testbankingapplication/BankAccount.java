/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankingapplication;

/**
 *
 * @author user
 */
public abstract class BankAccount {
   private String accountNumber; 
   private String accountHolder;
   private double balance;
   private double amount;

 
    public BankAccount() {
    }

   

    public BankAccount(String accountNumber, String accountHolder, double balance, double amount) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public abstract double deposit();
    public abstract double withdraw();

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance + ", amount=" + amount + '}';
    }
    
    
    
    
    
        
    
}
