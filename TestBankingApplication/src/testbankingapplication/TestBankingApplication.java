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
        //create SavingAccount class object
        BankAccount my = new SavingAccount();
        //create Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Number");
        //set account number
        my.setAccountNumber(input.nextLine());
        System.out.println("Enter account Holder Name");
        //set account holder name
        my.setAccountHolder(input.nextLine());

        System.out.println("Enter Balance");
         //ser balance
        my.setBalance(input.nextDouble());

        System.out.println("Press D for deposit and W for Withdraw");
        int i = 0;

        while (i <= 2) {
            i++;
            //choice D for deposit or W fro withdraw
            String choice = input.next();
            if (choice.equalsIgnoreCase("D")) {
                System.out.println("Enter Deposit amount");
                //set deposit amount
                my.setAmount(input.nextDouble());
                //add fund to account
                my.deposit();
                //print Bank info
                System.out.println(my.toString());
                break;
            } else if (choice.equalsIgnoreCase("W")) {
                System.out.println("Enter Withdraw amount");
                //set withdraw amount
                my.setAmount(input.nextDouble());
                  //deduct fund from account
                my.withdraw();
                    if (my.withdraw() == my.getBalance()) {
                   //Withdraw limit crossed
                    System.out.println("Transaction Failed.Crossed limit of Original Balance. Showing original Balance");

                }
                //print Bank info
                System.out.println(my.toString());
                break;
            }else{
                System.out.println("Invalid choice");
              
            }
            
        }
        //create CheckingAccount Class object
//        BankAccount myWithdraw = new CheckingAccount();
//        System.out.println("Enter Account Number");
//        //set account number
//        myWithdraw.setAccountNumber(input.nextLine());
//        System.out.println("Enter account Holder Name");
//        //set account holder name
//        myWithdraw.setAccountHolder(input.nextLine());
//
//        System.out.println("Enter Balance");
//        //ser balance
//        myWithdraw.setBalance(input.nextDouble());
//
//        System.out.println("Press D for deposit and W for Withdraw");
//        int j = 0;
//
//        while (j <= 2) {
//            j++;
//            //choice D for deposit or W fro withdraw
//            String choice = input.next();
//            if (choice.equalsIgnoreCase("D")) {
//                System.out.println("Enter Deposit amount");
//                //set amount to deposit
//                myWithdraw.setAmount(input.nextDouble());
//                //add fund to account
//                myWithdraw.deposit();
//                //print Bank info
//                System.out.println(myWithdraw.toString());
//                break;
//            } else if (choice.equalsIgnoreCase("W")) {
//                System.out.println("Enter Withdraw amount");
//                //set amount to withdraw
//                myWithdraw.setAmount(input.nextDouble());
//                //deduct fund from account
//                myWithdraw.withdraw();
//                
//                if (myWithdraw.withdraw() == myWithdraw.getBalance()) {
//                   //Withdraw limit crossed
//                    System.out.println("Transaction Failed.Crossed overdraft limit of 5% of Original Balance. Showing original Balance");
//
//                }
//                //print Bank info
//                System.out.println(myWithdraw.toString());
//                break;
//            } else {
//                
//                System.out.println("Invalid choice.Crossed 3 Chance limit.");
//            }
//
//        }

    }
}
