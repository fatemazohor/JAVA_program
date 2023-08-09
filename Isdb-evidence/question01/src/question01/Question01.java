
package question01;

import java.util.Scanner;


public class Question01 {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Enter positive integer number");
            int num = input.nextInt();
            if (num > 0) {
                sum += num;
            } else {
                System.out.println("Sum of Integer number = " + sum);
                break;
            }

        }

    }

}
