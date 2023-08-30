package q1recursion;

import java.util.Scanner;

public class Q1Recursion {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number to find its factorial");
            int number = input.nextInt();
            System.out.println("The factorial of " + number+ " is " +
                    factoral(number));

    
    
    
    }       
    public static int factoral(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factoral(n-1);
                    
        }
    }
}
