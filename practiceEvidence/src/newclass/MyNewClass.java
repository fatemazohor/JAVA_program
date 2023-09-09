/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newclass;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyNewClass {
    
    private double price;
    private double unit;
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The fib series");
        for (int i = 0; i <= number; i++) {
            System.out.println(fib(i));
        }
//        System.out.println(fib(number));
            
    }
    
    public static int fib(int n){
    
        if (n == 0) {
            return 0;
        } else if( n == 1){
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
        
    }
    
    
    
}
