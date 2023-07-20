/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_02_07;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise_02_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the min-
utes. For simplicity, assume a year has 365 days.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes here ");
        int minutes = input.nextInt();
        
        int days = (minutes%525600)/1440;
        
        int years = minutes/525600;
        
        System.out.println(minutes+" minutes is approximately " + years + " years and " + days+ "days");
    }
    
}
