package mytruck;

import myvehicle.Vehicle;

public class Truck extends Vehicle {

    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
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
            finalPrice = getRegularPrice() - (getRegularPrice() * discount);
        } else {
            finalPrice = getRegularPrice();
        }

        return finalPrice;
    }

}
