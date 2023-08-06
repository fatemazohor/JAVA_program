package createjarray;

import createarray.CreateArray;
import java.util.Arrays;

public class CreateJArray {

    public static void main(String[] args) {
//       
        CreateArray ra = new CreateArray();
        //create 2D-array using method
        int[][] myArray = ra.createJArray();

        //print 2D-array using method
        int[][] printArray = ra.printJArray(myArray);
        
        //print anonymous 2D-array using method
//        int[][] thisArray = ra.printJArray(new int[][]{{1,5,3},{4,5,6}});
        
        //create 2D-array
//        System.out.println(ra.createJArray());

        //print 2D-array           
//        System.out.println(Arrays.deepToString(ra.createJArray()));

        // print 2D-array using my methods
//        System.out.println(ra.printJArray(ra.createJArray()));
        
        
         // sum 2D-array value 
//        int sum = ra.sumJArray(myArray);

          int sumByCol = ra.sumJArrayByCol(myArray);
          System.out.println("Sum by Column = " + sumByCol);

         //print sum of 2D-array value
//        System.out.println("Sum value = " + sum);
//         System.out.println("Sum of array = " + ra.sumJArray(myArray));
        
            //find max and min value of each row
//            String maxMIN = ra.maxMinInRow(myArray);
//            System.out.println(maxMIN);

//            ra.maxMinInRow(myArray);


    }

}
