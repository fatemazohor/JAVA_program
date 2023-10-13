/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayindex;

/**
 *
 * @author joty_
 */
public class ArrayIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] newArray = new int[10];

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = (int) (Math.random() * 100);
        }
        
        
         for (int e : newArray) {
            //print newArray
            System.out.println("NewArray " + e);
            // sum array value
//            sum += e;
//            //largest among newArray value
//            max = max > e ? max : e;
//            //smallest among newArray value
//            min = min < e ? min : e;
        }

        int max = newArray[0], min = newArray[0], sum = 0;
        
        
          int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
            max = max > newArray[i] ? max : newArray[i];
            //find index of max
            if(newArray[i]==max){
                indexOfMax = i;
            }
//            for (int j = 1; j < newArray.length; j++) {
//
//                if (newArray[j] == max) {
//                    max = newArray[j];
//                    indexOfMax = j;
//
//                }
//
//            }
            min = min < newArray[i] ? min : newArray[i];
            //find index of min
            if(newArray[i]==min){
                indexOfMin = i;
            }
            
//            for (int k = 1; k < newArray.length; k++) {
//                
//                if (newArray[k] == min) {
////                    min = newArray[k];
//                    indexOfMin = k;
//
//                }
//
//            }
        }


//print largest newArray value and smallest value
        System.out.println("MAX " + max + " index " + indexOfMax +
                " \nMIN " + min + " index " + indexOfMin);
//
//        //print sum of array values
//        System.out.println("Sum = " + sum);
//        //print average of array values
//        System.out.println("Avg = " + sum / newArray.length);


    }
    
}
