/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceevidence;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class PracticeEvidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] myArray = {5, 4, 3, 2, 1};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {

                if (myArray[j] > myArray[j + 1]) {

                    int temp = myArray[j + 1];
                    myArray[j + 1] = myArray[j];
                    myArray[j] = temp;
                }

            }
        }
        System.out.println("New Array " + Arrays.toString(myArray));
//        for(int e:myArray){
//            System.out.println("My Array " + e);
//        }

    }

}
