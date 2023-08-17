package q2vehiclemanagement;

public class Q2VehicleManagement {

    public static void main(String[] args) {
        //Create object of Vehicle Class
        Vehicle myCar = new Car();
        Vehicle myMotor = new Motorcycle();

        //invoke overriden method from Car Class
        myCar.start();
        myCar.stop();
        //invoke overriden method from Motorcycle Class
        myMotor.start();
        myMotor.stop();

    }

}
