package vehiclemanagementsystem;

import subclasspak.Car;
import subclasspak.Motorcycle;

public class VehicleManagementSystem {

    public static void main(String[] args) {
        
        Vehicle car = new Car();
        
        car.start();
        car.stop();
        car.setBrand("Toyota");
        car.setRegistrationNumber("Toyota565");
        car.setYear(2020);
        System.out.println(car.toString());
        
        Vehicle motorcycle = new Motorcycle("Yamaha565", "Yamaha", 2020);
        
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.toString());
    }
    
}
