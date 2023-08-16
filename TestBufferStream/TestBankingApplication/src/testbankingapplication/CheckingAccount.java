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
    private double newBalance;

    public CheckingAccount() {
    }

    public CheckingAccount(double newBalance) {
        this.newBalance = newBalance;
    }

    public CheckingAccount(double newBalance, String accountNumber, String accountHolder, double balance, double amount) {
        super(accountNumber, accountHolder, balance, amount);
        this.newBalance = newBalance;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }
    
   

    

    
    
    
    @Override
    public double deposit() {
        newBalance = (super.getAmount() > 0) ? (super.getBalance()+super.getAmount()) : super.getBalance();
        super.setBalance(newBalance);
        return newBalance;
                
    }

    @Override
    public double withdraw() {
        newBalance = (super.getAmount() <= (super.getBalance()*1.05)) ? (super.getBalance() - super.getAmount()): super.getBalance();
//        if (super.getAmount()+100 > super.getBalance()) {
//            newBalance = -(super.getAmount() - super.getBalance());
//        } else if(super.getAmount() <= super.getBalance()){
//            newBalance = super.getBalance() - super.getAmount();
//        }
//        else{
//         newBalance = super.getBalance();
//        }
        super.setBalance(newBalance);
        return newBalance;
        
        
    }

    @Override
    public String toString() {
//        double myBalance = super.getAmount() < 1 ? super.getBalance(): newBalance;
//        balance = super.getAmount() < 1 ? super.getBalance(): newBalance;
        
        return "BankAccount{" + "accountNumber=" + super.getAccountNumber() + ", accountHolder=" + super.getAccountHolder() + ", balance=" + super.getBalance() + ", amount=" + super.getAmount() + '}';
    }
    
    

    
    
    
  
    
}
