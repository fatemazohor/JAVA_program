package question03;

import java.util.Scanner;
import mytruck.Truck;
import myvehicle.Vehicle;

public class Question03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regular price");
        //get regular price
        double regularPrice = sc.nextDouble();

        System.out.println("Enter weight");
        //get weight
        int weight = sc.nextInt();
        
        
        //Create object of Vehicle class
        Vehicle in = new Vehicle();
        in.setSpeed(0);
        in.setColor("red");
        in.setRegularPrice(regularPrice);
        
        //Create object of Truck class
        Truck op = new Truck();
        op.setColor("blue");
        op.setSpeed(0);
        //set regular price
        op.setRegularPrice(regularPrice);
        //set weight
        op.setWeight(weight);
        
        //get value from getSalePrice() 0f Truck class
        double result = op.getSalePrice();
        System.out.println("Final Truck Price " + result);

    }

}
