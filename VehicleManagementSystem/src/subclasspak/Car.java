package subclasspak;

public class Car extends Vehicle implements TestInterface{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year, double unitPrice, int unitOfProduct) {
        super(registrationNumber, brand, year, unitPrice, unitOfProduct);
    }

    
   

    @Override
    public void start() {
        System.out.println("Car engine stated");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void doWelcome() {
        System.out.println("WELCOME");
    }

    @Override
    public void doBye() {
        System.out.println("BYE");
    }
    
}
