package createarray;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

    public static void main(String[] args) {
        //array declare and create
        double[] point = new double[10];

        point[0] = 9.0;
        point[1] = 8.0;
        point[2] = 11.0;
        point[3] = 158.0;
        point[4] = 19.0;

//        for(double p:point){
//            System.out.println(p);
//        }
        //array initilizer, can be used to change array value any time
        int[] num = {14, 65, 6, 94, 47, 65, 89};
//        System.out.println("num array " + Arrays.toString(num));
        // output show [14,65,6,94,47,65,89]

//        for(int i=7 ;i<10;i++){
//            num[i] = i;
//        }
//        System.out.println("New_num array " + Arrays.toString(num));
        int[] newArray = new int[10];

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = (int) (Math.random() * 100);
        }

        int max = newArray[0], min = newArray[0], sum = 0;

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

        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
            max = max > newArray[i] ? max : newArray[i];
            for (int j = 1; j < newArray.length; j++) {

                if (newArray[j] > max) {
                    max = newArray[j];
                    indexOfMax = j;

                }

            }
            min = min < newArray[i] ? min : newArray[i];
            for (int k = 1; k < newArray.length; k++) {

                if (newArray[k] > min) {
                    min = newArray[k];
                    indexOfMin = k;

                }

            }
        }

//        for(int i =1 ; i <newArray.length; i ++){
//                
//            if(newArray[i] > max){
//                max = newArray[i];
//                indexOfMax = i;
//                System.out.println("index "+ indexOfMax);
//            }
//        
//        }

        //print largest newArray value and smallest value
        System.out.println("MAX " + max + " index " + indexOfMax + " \nMIN " + min + " index " + indexOfMin);

        //print sum of array values
        System.out.println("Sum = " + sum);
        //print average of array values
        System.out.println("Avg = " + sum / newArray.length);

        
    }

}
