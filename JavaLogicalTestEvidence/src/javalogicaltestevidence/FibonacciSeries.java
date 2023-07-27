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
public class FibonacciSeries {
    public static void main(String[] args) {
        
        // Create scanner to prompt input
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter number to find fibonacci series");
        int number = input.nextInt();
        
        //first digit in fibonacci series
        int n1 = 0;
        System.out.println("First " + number + " fibonacci number series \n" + n1);
        // second digit in fibonaccia series
        int n2 =1;
        System.out.println(n2);

        
        
        while(number > 2){
        
            int sum = n1 + n2;
            System.out.println(sum);
            
            
            n1 = n2;
            n2 = sum;
            number--;
            
//            System.out.println("temp " + temp);
        }
            
          
                    

      
        
        
    }
}
