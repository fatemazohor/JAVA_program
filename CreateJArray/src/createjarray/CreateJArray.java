package createjarray;

import createarray.CreateArray;

public class CreateJArray {

    public static void main(String[] args) {
//       
        CreateArray ra = new CreateArray();

        int[][] array = ra.createJArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.println(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
