package subclasspak;

public class Motorcycle extends Vehicle{

    public Motorcycle() {
    }

    public Motorcycle(String registrationNumber, String brand, int year, double unitPrice, int unitOfProduct) {
        super(registrationNumber, brand, year, unitPrice, unitOfProduct);
    }


    

    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped");
    }
    
}
