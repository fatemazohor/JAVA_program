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

            }

        }
        return array;

    }

}
