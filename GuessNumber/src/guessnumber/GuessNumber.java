/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        int firstNumber = (int)(Math.random()*10); 
//                    
//                    for(int i = 1; i <=5; i++){
//                    System.out.println("Guess the number");
//                    int answer = input.nextInt();
//                    
//                    
//                    if(answer >= 10){
//                        System.out.println("Only one Digit number is allowed");    
//                    }
//                    else if(firstNumber == answer){
//                        System.out.println("Hurray! you win " +"and the number is " + firstNumber);
//                        break;
//                    }
//                    else{
//                        System.out.println("Better luck next time ");
//                    }                    
//                    }                    
                    
                    
                   /**
                    * Guess a number between 20 to 39.
                    */
                    int guess = (20 + (int)(Math.random()*20));
                    
                    for(int i = 1; i <=5; i++){
                    System.out.println("Guess the number between 20 to 39");
                    int yourNumber = input.nextInt();
                    
//                    guess number 2nd digit
                    int number1 = guess/10;
//                    guess number 1st digit
                    int number2 = guess%10;
                    
//                    answer number 2nd digit
                    int digit1 = yourNumber/10;
//                    answer number 1st digit.
                    int digit2 = yourNumber%10;
                    
//                    only 2 digit number is 
                    if(yourNumber >= 100){
                        System.out.println("Only two Digit number is allowed");
                        
                    }
                    else{
                        
                        if(guess == yourNumber){
                        System.out.println("Hurray! complete match. you won 1000 taka." );
                        break;
                        }
                        else if(number1 == digit1 || number2 == digit2){
                            System.out.println("You won 500 taka for one digit match.");
                            break;
                        }
                        else if(
                                number1 == digit1 
                                || number1 == digit2
                                || number2 == digit1 
                                || number2 == digit2
                                ){
                            System.out.println("You only won 200 taka.");
                            break;
                        }
                        
                        else{
                            System.out.println("Better luck next time ");
                        }
                        
                    }
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                   
    }
    
}
