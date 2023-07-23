/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicalevidence;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LogicalEvidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1. Write a program which calculate 1 to 50 except 7, 15 and 23;
2. Write a program using prompt for time table of any number. Output will be like this
2X1=2
2X2=4
3. Find next 5 integer number by using prompt from any value.
4. Find Prime number of in a range of number.
5. Find factorial of any member.
6. Find first 8 Fibonacci number series.
7. Find the max and min number from three number.
8. Find value of X" number with any value.
9. Input 5 number in an array and make sum of these value.
10. Make a html file with input field as Price another input field as discount percentage and calculate the price after discount.
         */
//      4. Find Prime number of in a range of number.  
        Scanner rin = new Scanner(System.in);
        
//        System.out.println("enter 2 number");
//        int inputNumber = rin.nextInt();
//        
//        int inputNumber2 = rin.nextInt();
//        
////       
//        
//        
//        if(inputNumber >= inputNumber2){
//            System.out.println("number1 < number3");
//        }
//        else{
//        for(int j = inputNumber; j <= inputNumber2; j++){
//            int count = 0;
//            for(int mynum = 1; mynum <= j; mynum++){
//                if(j % mynum == 0){
//                    count += 1;
//                }
//            }
//            if(count == 2){
//                System.out.println("Prime Number "+ j);
//            }
//        }
//        }
        
        String message = "Welcome to Java";
        String m1 = message.substring(3);
         message = message.substring(0, 3) + "HTML";
//         System.out.println("m1 " + m1);
//        System.out.println("me " + message);
//        System.out.println("a " + message.indexOf('a', 14));
        System.out.println("Welcome to Java".lastIndexOf("Java"));
        System.out.println("chr " + message.lastIndexOf('a'));
        
//        Find factorial of any member.

                
        
        
        
    }
    
}
