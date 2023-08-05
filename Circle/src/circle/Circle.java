/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import geo.GeoMetry;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter radius");
        //enter number for radius value
        double num = input.nextDouble();

        //enter radius using argument constructor
        GeoMetry ra = new GeoMetry(num);

        //enter radius as Circle class propertie's radius value.
//        ra.radius = input.nextDouble();
        System.out.println("Area of Circle " + ra.getArea());
        System.out.println("Perimenter of Circle " + ra.getPerimeter());
        
    }
    
}
