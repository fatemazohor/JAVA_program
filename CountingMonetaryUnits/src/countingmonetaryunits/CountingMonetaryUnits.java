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
        
//        System.out.println("Please enter Monetary amount ");
//        double money = input.nextDouble();
//        
//        int numberOfCent = (int)(money*100);
//        
//        int numberOfDollar = numberOfCent/100;
//        int remainingAmount = numberOfCent%100;
//        
//        int numberOfQuerter = remainingAmount/25;
//        remainingAmount = remainingAmount%25;
//        
//        int numberOfDime = remainingAmount/10;
//        remainingAmount = numberOfCent%10;
//        
//        int numberOfNickel = remainingAmount/5;
//        remainingAmount = remainingAmount%5;
//        
//        
//        
//        System.out.println("Your amount " + money + " consist of ");
//        System.out.println("Your amount " + numberOfDollar + " Dollar");
//        System.out.println("Your amount " + numberOfQuerter + " Querter");
//        System.out.println("Your amount " + numberOfDime + " Dime");
//        System.out.println("Your amount " + numberOfNickel + " Nickel");
//        System.out.println("Your amount " + remainingAmount + " Pennies");


//            System.out.println("Celsius = ");
//            double celsius = input.nextDouble();
//            
//            double s1 = celsius*(9.0/5);
//            
//            double fahrenheit = s1 + 32;
//            
//            System.out.println("Fahrenheit = "+fahrenheit);

//                System.out.println("radius , length");
//                double radius = input.nextDouble();
//                double length = input.nextDouble();
//                
//                double PI = 3.1416;
//                
//                double area = radius * radius * PI;
//                double volume = area * length;
//                
//                System.out.println("area = " + area + " volume = " + volume);

              System.out.println("enter");
              int number = input.nextInt();
//
//        int firstDigit = number % 10;
//        int remain = number / 10;
//        int secDigit = remain % 10;
//        remain = remain / 10;
//
//        int thirdDigit = remain;
//
//        int total = firstDigit + secDigit + thirdDigit;
//
//        System.out.println("firstDigit " + firstDigit);
//        System.out.println("secDigit " + secDigit);
//        System.out.println("thirdDigit " + thirdDigit);
//        System.out.println("Total = " + total);
                
//(Sum the digits in an integer) Write a program that reads an integer between 0 and
//1000 and adds all the digits in the integer. For example, if an integer is 932, the
//sum of all its digits is 14.                 
                 int sum =0;
                if(number <= 9999){  
                for(int i = 1; i<=4; i++){
                     
                    int digit = number%10;
                    int remain = number /10;
                    sum +=digit; 
                    
                    int temp = number;
                    number = remain;
                                                                     
                }
                }
                System.out.println("Sum = " + sum);
                    
            

    }
    
}
