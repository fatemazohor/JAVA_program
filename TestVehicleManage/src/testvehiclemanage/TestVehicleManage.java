package testvehiclemanage;

public class TestVehicleManage {

    public static void main(String[] args) {
        //create actual object of Car, Motorcycle class
        Vehicle myCar = new Car("S165496", "Toyota", 2020);
        Vehicle myMotor = new Motorcycle("E987945","Yamaha",2021);
        
        //get start(), stop() method for myCar.
        myCar.start();
        myCar.stop();
        System.out.println(myCar.toString());
        
        //get start(), stop() method for myMotor.
        myMotor.start();
        myMotor.stop();
        System.out.println(myMotor.toString());
        
        
        
    }
    
}
