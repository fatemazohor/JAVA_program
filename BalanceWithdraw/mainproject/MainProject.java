package mainproject;

import java.util.Scanner;

public class MainProject {

    static double balance = 1000;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Your balane is " + balance);
        System.out.println("For withderw press \'W\'"
                + " For deposit press \'D\'");

        String choice = input.next();
        double amount = 0;
        if (choice.equalsIgnoreCase("W")) {

            System.out.println("Please enter amount");
            amount = input.nextDouble();
            double newBalance = withdraw(amount);
            System.out.println("Remaining balance = " + newBalance);
        } else if (choice.equalsIgnoreCase("D")) {
            System.out.println("Please enter amount");
            amount = input.nextDouble();
            double newBalance = deposit(amount);
            System.out.println("Updated balance = " + newBalance);
        } else {
            System.out.println("Invalid input");
        }

    }

    public static double withdraw(double amount) {

        balance -= amount;

        return balance;
    }

    public static double deposit(double amount) {

        balance += amount;
        return balance;
    }

}
