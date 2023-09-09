package vehiclemanagementsystem;

<<<<<<< Updated upstream
import subclasspak.Vehicle;
=======
import edible.Apple;
import edible.Fruits;
>>>>>>> Stashed changes
import subclasspak.Car;
import subclasspak.Motorcycle;

public class VehicleManagementSystem {

    public static void main(String[] args) {
        
<<<<<<< Updated upstream
        Vehicle car = new Car();
        Car newCar = new Car();
        
        newCar.doWelcome();
        car.start();
        car.stop();
        car.setBrand("Toyota");
        car.setRegistrationNumber("Toyota565");
        car.setYear(2020);
        System.out.println(car.toString());
        newCar.doBye();
        
        Vehicle motorcycle = new Motorcycle("Yamaha565", "Yamaha", 2020);
        
        motorcycle.start();
        motorcycle.stop();
=======
//        Vehicle car = new Car();
//        
//        car.start();
//        car.stop();
//        car.setBrand("Toyota");
//        car.setRegistrationNumber("Toyota565");
//        car.setYear(2020);
//        System.out.println(car.toString());
        
        Vehicle motorcycle = new Motorcycle("A4546", "Yamaha", 2020, 1200000, 1);
//        
//        motorcycle.start();
//        motorcycle.stop();
>>>>>>> Stashed changes
        System.out.println(motorcycle.toString());
        System.out.println("price =" + motorcycle.totalPrice());
        System.out.println("price after tax =" + motorcycle.priceAfterTax());
        
        //edible pakage object
        Fruits apple = new Apple(100, 3);
        System.out.println("Apple of "+ apple.getUnitOfProduct()+ " kg price is "+apple.totalPrice());
        System.out.println("Price of apple after tax = "+ apple.priceAfterTax());
        
    }
    
}
