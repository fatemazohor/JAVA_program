
package testbankingapplication;


public class SavingAccount extends BankAccount {

    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = amount > 0 ? super.getBalance() + amount : super.getBalance();

        super.setBalance(newBalance);
        if (amount > 0) {
            System.out.println("Transaction successful. Deposit amount = " + amount
                    + "\nNew Balance = " + super.getBalance());
        } else {
            System.out.println("Transaction Failed");
        }

    }

    @Override
    public void withdraw(double amount) {

        if (super.getBalance() >= amount && (amount > 0)) {
            double newBalance = super.getBalance() >= amount ? super.getBalance() - amount : super.getBalance();
            System.out.println("Transaction successful. Withdraw amount = " + amount
                    + "\nNew Balance = " + newBalance);
            super.setBalance(newBalance);
        } else {
            System.out.println("Transaction Failed. Not enough balance.");
        }

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
