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
public class CheckingAccount extends BankAccount{

    public CheckingAccount() {
    }

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = amount > 0 ? super.getBalance()+amount:super.getBalance();
        
        super.setBalance(newBalance);
        if (amount > 0) {
            System.out.println("Transaction successful. Deposit amount = " + amount+ 
                "\nNew Balance = " + super.getBalance());
        } else {
            System.out.println("Transaction Failed");
        }
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = (super.getBalance()*1.05) >= amount ? super.getBalance() - amount:super.getBalance();
        
        
        if ((super.getBalance()*1.05) >= amount) {
             System.out.println("Transaction successful. Withdraw amount = " + amount+ 
                "\nNew Balance = " + newBalance);
        } else {
            System.out.println("Transaction Failed. Not enough balance.");
        }
       super.setBalance(newBalance);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
