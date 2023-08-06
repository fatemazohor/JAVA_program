/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createarray;

import java.util.Scanner;

public class CreateArray {

    public int[][] createJArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Row: ");
        int row = input.nextInt();

        System.out.println("Enter the Col: ");
        int col = input.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = (int) (Math.random() * 100);
//                int val = (int)(Math.random() * 100);
//                if(val > 10 && val != 0 ){
//                   array[i][j] = val; 
//                }

            }

        }
        return array;

    }

    public int[][] printJArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        return array;
    }

    public int sumJArray(int[][] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];

            }

        }

        return sum;
    }

    public int sumJArrayByCol(int[][] array) {

        int sumByCol = 0;
        int column = 0;
        for (int col = 0; col < array[col].length; col++) {
            for (int row = 0; row < array.length; row++) {
                sumByCol += array[row][col];

            }

        }

        return sumByCol;
    }

    public String maxMinInRow(int[][] array) {

        int max, min;
        String result = "";

        for (int row = 0; row < array.length; row++) {

            max = array[row][0];
            min = array[row][0];

            for (int col = 1; col < array[row].length; col++) {

                //find maximum value for each row
                max = max > array[row][col] ? max : array[row][col];

                //find minimum value for each row
                min = min < array[row][col] ? min : array[row][col];

            }
            //print max and min for each row in 2D-array
            System.out.println("Row [" + row + "] max value is = " + max
                    + " and min value is = " + min);
            // code only show last row value
//            result = ("Row [" + row + "] max value is = " + max
//                    + " and min value is = " + min);

        }

        return result;
    }

}
