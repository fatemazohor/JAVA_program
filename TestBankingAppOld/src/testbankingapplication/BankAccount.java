
package testbankingapplication;


public abstract class BankAccount {
   private String accountNumber; 
   private String accountHolder;
   private double balance;

 
    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
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
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance + '}';
    }
    
    
    
    
    
        
    
}
