/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainproject;

import findprime.FindPrime;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        
        FindPrime p = new FindPrime();
        
        
        
        System.out.println("Enter number");
        int number = o.nextInt();
        
        System.out.println(p.findPrimeNumber(number));
        
        
        
    }
    
}
