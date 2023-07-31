/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domath;

import java.util.Scanner;
import mainproject.FindPrimeNumber;

/**
 *
 * @author user
 */
public class DoMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        FindPrimeNumber input = new FindPrimeNumber();

        System.out.println("Enter a number ");
        int number = in.nextInt();

        System.out.println(input.findPrimeNumber(number));

        System.out.println(number + " factorial is " + input.findFactorial(number));
        System.out.println("Fibonacci Series");
        System.out.println(input.findfib(number));
        
    }

}
