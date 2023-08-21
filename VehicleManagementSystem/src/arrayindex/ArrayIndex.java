package arrayindex;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        
        int[] testArray = new int[100];
        for (int i = 0; i < 99; i++) {
            testArray[i] = (int)(Math.random()*100);
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter index number");
        
        try {
            int userInput = input.nextInt();
            System.out.println("At index "+userInput+" the number is "
                    +testArray[userInput]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Out of Bounds");
              System.out.println(e);
        }
    }
}
