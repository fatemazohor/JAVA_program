/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceevidence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class PracticeEvidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] myArray = {5, 4, 3, 2};
        System.out.println("Original " + Arrays.toString(myArray));
        boolean nexPas = true;
        for (int i = 1; i < myArray.length-1; i++) {
            nexPas = false;
            for (int j = 0; j < myArray.length-i ; j++) {

                if (myArray[j] > myArray[j + 1]) {
//                    System.err.println("j "+ j+ " i "+i);
//                    System.err.println("myArray[j] "+myArray[j]+" myArray[j + 1] "+ myArray[j + 1]);
                    
                    int temp = myArray[j + 1];
//                    System.err.println("temp "+ temp);
                    
                    myArray[j + 1] = myArray[j];
//                    System.err.println("myArray[j] "+ myArray[j]);
                    
                    myArray[j] = temp;
//                    System.err.println("myArray[j] "+ myArray[j]+ " swapped value");
//                    System.err.println("myArray[j + 1] " +myArray[j + 1]);

                }
                System.out.println("New Array " + Arrays.toString(myArray));
                nexPas = true;
            }
            
        }
        System.out.println("New Array1 " + Arrays.toString(myArray));
//        for(int e:myArray){
//            System.out.println("My Array " + e);
//        }
        List<Integer> m = new ArrayList<>();
        
        m.add(65);
        m.add(45);
        m.add(5);
        System.out.println(m);
        m.add(79);
        System.out.println(m);
        ArrayList<Integer> n = new ArrayList<>();
        n.add(14);
    }

}
