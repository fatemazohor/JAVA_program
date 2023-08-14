/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankingapplication;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestBankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BankAccount my = new SavingAccount();

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter Account Number");
//
//        my.setAccountNumber(input.nextLine());
//        System.out.println("Enter account Holder Name");
//        my.setAccountHolder(input.nextLine());
//
//        System.out.println("Enter Balance");
//        my.setBalance(input.nextDouble());
//
//        System.out.println("Press D for deposit and W for Withdraw");
//        int i = 0;
//
//        while (i <= 2) {
//            i++;
//            String choice = input.next();
//            if (choice.equalsIgnoreCase("D")) {
//                System.out.println("Enter Deposit amount");
//                my.setAmount(input.nextDouble());
//                my.deposit();
//                System.out.println(my.toString());
//                break;
//            } else if (choice.equalsIgnoreCase("W")) {
//                System.out.println("Enter Withdraw amount");
//                my.setAmount(input.nextDouble());
//                my.withdraw();
//                System.out.println(my.toString());
//                break;
//            }else{
//                System.out.println("Invalid choice");
//              
//            }
//            
//        }
        BankAccount myWithdraw = new CheckingAccount();
        System.out.println("Enter Account Number");

        myWithdraw.setAccountNumber(input.nextLine());
        System.out.println("Enter account Holder Name");
        myWithdraw.setAccountHolder(input.nextLine());

        System.out.println("Enter Balance");
        myWithdraw.setBalance(input.nextDouble());

        System.out.println("Press D for deposit and W for Withdraw");
        int j = 0;

        while (j <= 2) {
            j++;
            String choice = input.next();
            if (choice.equalsIgnoreCase("D")) {
                System.out.println("Enter Deposit amount");
                myWithdraw.setAmount(input.nextDouble());
                myWithdraw.deposit();
                System.out.println(myWithdraw.toString());
                break;
            } else if (choice.equalsIgnoreCase("W")) {
                System.out.println("Enter Withdraw amount");
                myWithdraw.setAmount(input.nextDouble());
                myWithdraw.withdraw();
                System.out.println(myWithdraw.toString());
                break;
            } else {
                System.out.println("Invalid choice.Crossed overdraft limit of 100 Taka.");
            }

        }

    }
}
