package subclasspak;

public class Car extends vehiclemanagementsystem.Vehicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Car engine stated");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
    
}
