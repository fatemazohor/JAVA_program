/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricecalculation;

import java.util.Scanner;
import pricequentity.Price;

/**
 *
 * @author user
 */
public class PriceCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Unit Price of product");
        double myPrice = input.nextDouble();

        System.out.println("Enter Quentity of product");
        int myUnit = input.nextInt();
        
//        //calculate price with price object
//        Price in = new Price(myUnit, myPrice);
//
//        in.calculateUnitPrice();
        
        //calculate price with secondBuy object
        Price secondBuy = new Price();
        secondBuy.setQuentity(myUnit);
        secondBuy.setUnitPrice(myPrice);

        double actualPrice = secondBuy.calculateTotalPrice();

        //Check for discount
        double newPrice = 0.0;
        double discount = 0.050;
        if (actualPrice >= 100) {
            discount = actualPrice * discount;
            newPrice = actualPrice - (discount);
        } else {
            newPrice = actualPrice;
        }

        System.out.println("Your total amount = " + Math.round(newPrice)
                + " \nand discount amount = " + Math.round(discount) + "\n Thanks");

    }

}
