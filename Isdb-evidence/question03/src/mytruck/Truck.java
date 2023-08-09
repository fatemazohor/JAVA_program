
 
package mytruck;

import myvehicle.Vehicle;


public class Truck extends Vehicle {

    private int weight;

    public Truck() {
    }

    public Truck(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        double finalPrice = 0;
        double discount = 0.10;

        if (weight > 2000) {
            finalPrice = super.regularPrice - (super.regularPrice * discount);
        }else {
        finalPrice = super.regularPrice;
        }

        return finalPrice; 
    }

}
