package testbankingapplication;

import java.util.Scanner;

public class TestBankingApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Number");
        String accNumber = input.nextLine();
        System.out.println("Enter Account Holder Name");
        String accName = input.nextLine();
        System.out.println("Enter Balance amount");
        double myBalance = input.nextDouble();
        System.out.println("Enter 1 for Saving Account Or 2 for Checking account");

        try {

            int choice = input.nextInt();
            switch (choice) {
                case (1):
                    BankAccount myDeposit = new SavingAccount(accNumber, accName, myBalance);

                    int chance = 0;
                    while (chance <= 2) {
                        System.out.println("Enter D for deposit and W for withdraw");
                        String entry = input.next();
                        chance++;
                        if (entry.equalsIgnoreCase("D")) {

                            System.out.println("Enter Deposit Amount");
                            double amount = input.nextDouble();
                            myDeposit.deposit(amount);
                            break;
                        } else if (entry.equalsIgnoreCase("W")) {

                            System.out.println("Enter Withdraw Amount");
                            double amount = input.nextDouble();
                            myDeposit.withdraw(amount);
                            break;
                        } else {
                            System.out.println("Invalid Choice. Try again");
                        }

                    }
                    System.out.println("Transaction End");
                    System.out.println(myDeposit.toString());
                    break;
                case (2):
                    BankAccount myWithdraw = new CheckingAccount(accNumber, accName, myBalance);

                    int tryAgain = 0;
                    while (tryAgain <= 2) {
                        System.out.println("Enter D for deposit and W for withdraw");
                        String entry = input.next();
                        tryAgain++;
                        if (entry.equalsIgnoreCase("D")) {

                            System.out.println("Enter Deposit Amount");
                            double amount = input.nextDouble();
                            myWithdraw.deposit(amount);
                            break;
                        } else if (entry.equalsIgnoreCase("W")) {

                            System.out.println("Enter Withdraw Amount");
                            double amount = input.nextDouble();
                            myWithdraw.withdraw(amount);
                            break;
                        } else {
                            System.out.println("Invalid Choice. Try again");
                        }

                    }
                    System.out.println("Transaction End");
                    System.out.println(myWithdraw.toString());
                    break;
                default:
                    System.out.println("Invalid choice.");

            }
        } catch (Exception e) {
            System.out.println("Invalid number");
        }

    }

}
