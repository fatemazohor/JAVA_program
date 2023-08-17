package q1randomarray;

import java.util.Scanner;

public class Q1RandomArray {

    public static void main(String[] args) {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        //Create Scanner 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter index of the number to check");
        //input index number to check
        int indexArray = input.nextInt();

        try {
            //print number for given index number
            System.out.println(myArray[indexArray]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //print error message if input number cross index number range.
            System.out.println(e);
        }
    }

}
