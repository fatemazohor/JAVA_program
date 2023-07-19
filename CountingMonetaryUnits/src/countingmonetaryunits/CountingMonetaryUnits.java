/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingmonetaryunits;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CountingMonetaryUnits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter Monetary amount ");
        double money = input.nextDouble();
        
        int numberOfCent = (int)(money*100);
        
        int numberOfDollar = numberOfCent/100;
        int remainingAmount = numberOfCent%100;
        
        int numberOfQuerter = remainingAmount/25;
        remainingAmount = remainingAmount%25;
        
        int numberOfDime = remainingAmount/10;
        remainingAmount = numberOfCent%10;
        
        int numberOfNickel = remainingAmount/5;
        remainingAmount = remainingAmount%5;
        
        
        
        System.out.println("Your amount " + money + " consist of ");
        System.out.println("Your amount " + numberOfDollar + " Dollar");
        System.out.println("Your amount " + numberOfQuerter + " Querter");
        System.out.println("Your amount " + numberOfDime + " Dime");
        System.out.println("Your amount " + numberOfNickel + " Nickel");
        System.out.println("Your amount " + remainingAmount + " Pennies");
    }
    
}
