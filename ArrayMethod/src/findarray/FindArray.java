/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findarray;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FindArray {

    Scanner input = new Scanner(System.in);

    public void createArray(int[][] newMultiArray, int x, int y) {
        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                newMultiArray[row][col] = input.nextInt();
            }
        }

    }

    public void printArray(int[][] newMultiArray, int x, int y) {

        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                System.out.print(newMultiArray[row][col] + " ");
            }
            System.out.println("");
        }

    }
}
