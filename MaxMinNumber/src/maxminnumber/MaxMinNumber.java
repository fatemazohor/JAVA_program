/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxminnumber;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MaxMinNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner input
        Scanner in = new Scanner(System.in);
//        int count = 0;
//        int max = 0;
//        do {
//            // number input to compare with max 
//            System.out.println("Input number");
//            int number = in.nextInt();
//
//            max = max > number ? max : number;
//            count += 1;
//        } while (count < 3);
//
//        System.out.println("Max " + max);
        
        
        int count = 0;
        int max =0, min = 999999999;

//        // Enter integer number
//        System.out.println("Input number");
//        int number = in.nextInt();
        

        // keep reading data untill count < 2
//        do {
//            // number input to compare with max 
//            System.out.println("Input number now");
//            number = in.nextInt();
//
//            max = max > number ? max : number;
//            min = min < number ? min : number;
//            count += 1;
//
//        } while (count < 2);
//
//        System.out.println("Max " + max + " MIn " + min);
        
        
        for(int i = 1; i <= 3; i++){
           
            // Enter integer number
        System.out.println("Enter number " + i +" to find Maximum and Minimum among three numbers");
        int number = in.nextInt();
 
            max = max > number ? max : number;
            
            // find minimum number
            min = min < number ? min : number;
           
        }
        
        System.out.println("Maximum number = " + max + " Minimum number = " + min);
        
        
        
        
    }
    
}
