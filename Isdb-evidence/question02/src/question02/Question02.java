
package question02;

import java.util.Scanner;


public class Question02 {

    
    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
         System.out.println("Enter number to calculate factorial");
         int num = input.nextInt();
         int facto = 1;
         for(int i =1 ; i <= num; i++){
             facto *=i;
         }
         System.out.println("Factorial of "+ num + " is " + facto);
    }
    
    
}
