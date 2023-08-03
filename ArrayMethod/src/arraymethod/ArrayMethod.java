package arraymethod;

import findarray.FindArray;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FindArray multi = new FindArray();

        System.out.println("Enter array row X and column Y");
        int x = input.nextInt();
        int y = input.nextInt();
       

        //Declear and create multi-dimensional array
        int[][] myArray = new int[x][y];
        // Use for loop to create array
//        for (int row = 0; row < x; row++) {
//            for (int col = 0; col < y; col++) {
//                myArray[row][col] = input.nextInt();
//            }
//        }
//      use method to create loop
        System.out.println("Enter array value");
        multi.createArray(myArray, x, y);
//         use method to print loop
        System.out.println("print array");
        multi.printArray(myArray, x, y);
        //print array
//        for(int row = 0; row < x; row++ ){
//            for(int col=0; col < y; col++){
//                System.out.print(myArray[row][col]+" ");
//            }
//            System.out.println("");
//        }

        //use Array method to print array
//System.out.println(Arrays.deepToString(myArray));

//        //use array method equals, sort, parraller sort
//        int[] first = {1, 2, 3, 4, 5};
//        int[] second = {1, 2, 3, 4, 6};
//        int[] third = {5, 3, 2, 4, 6};
//        
//        //parallel sort
//        Arrays.parallelSort(third,0,3);
//        System.out.println(Arrays.toString(third));
//        //sort third array
//        Arrays.sort(third);
//        System.out.println(Arrays.toString(third));
//        
//        //check array equality
//        System.out.println(Arrays.equals(third, second));
//        int[][] multiArray = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
//        System.out.println(Arrays.deepToString(multiArray));

    }

}
