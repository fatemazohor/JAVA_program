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
public class JavaLogicalTestEvidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create scanner for prompt input
        Scanner input = new Scanner(System.in);
        
        
//        Find prime number from number1 to number2

//        // Take number1 input
//        System.out.println("Enter first number which is bigger than 1");
//        int number1 = input.nextInt();
//        
//        // Take number2 input
//        System.out.println("Enter second number which is bigger than number1 and 1");
//        int number2 = input.nextInt();
//       
//        if((number1 > number2) || number1 <2 || number2 <2 ){
//        
//            System.out.println("Number1 can't be bigger than Number2 and also number 0 and 1 isn't allowed as input");
//      
//        }
//        else{
//        
//            for(int i = number1; i <= number2; i++){
//
//                int count = 0;
//                for(int j = 2; j <= i ; j++){
//                    // if number is divisible by any number within 2 to number/2, it is not prime.
//                    if(i % j ==0){
//                    count += 1;                    
//                    }
//                }
//                if(count < 2){
//
//                    //print prime number
//                System.out.println("prime " + i);
//                }       
//            }
//        }
//        Find prime number from number1 to number2...END        
        System.out.println("Enter number to check if it is a prime number.");
        int firstNum = input.nextInt();
        // prime number start from 2.
        if(firstNum >1){
        
            int count = 0;
            for(int i = 2; i <= firstNum; i++){
            
                if(firstNum % i == 0){
                count += 1;                
                }        
            }
            
            if(count < 2){
                System.out.println("Prime = " + firstNum);
            }
            else{
                System.out.println(firstNum  +" is not a prime number");
            }
         
        }
        else{
        
            System.out.println("Number which are >= 1 is not allowed as valid input. Prime number start from 2");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
