/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalogicaltestevidence;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FactorialNUmber {
    public static void main(String[] args) {
        
        // Create scanner to prompt input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Digit to find factorial");
        
        int digit = input.nextInt();
        int factorial = 1;
        
//        int number = digit;
//        while(digit > 0){
//        
//            //calculate digit factorial.
//            factorial *= digit;
//            digit--;
//        }
//        
//        System.out.println("the factorial of " + number + " is " + factorial);

            for(int i = 1; i <= digit; i++){
            
                // calculate factorial of digit.
                factorial *= i;
            }
            System.out.println("the factorial of " + digit + " is " + factorial);
        
    }
}
