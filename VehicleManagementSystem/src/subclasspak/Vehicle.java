package subclasspak;



import interfacepak.TaxableInterface;

public abstract class Vehicle implements TaxableInterface{
    
    private String registrationNumber;
    private String brand;
    private int year;
    private double unitPrice;
    private int unitOfProduct;

    public Vehicle() {
    }

    

    public Vehicle(String registrationNumber, String brand, int year, double unitPrice, int unitOfProduct) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.year = year;
        this.unitPrice = unitPrice;
        this.unitOfProduct = unitOfProduct;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitOfProduct() {
        return unitOfProduct;
    }

    public void setUnitOfProduct(int unitOfProduct) {
        this.unitOfProduct = unitOfProduct;
    }
    
    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return "Vehicle{" + "registrationNumber=" + registrationNumber + ", brand=" + brand + ", year=" + year + '}';
    }
    
    public double totalPrice(){
        return (unitOfProduct*unitPrice) ;
    }

    @Override
    public double priceAfterTax() {
        return (unitOfProduct*unitPrice)*1.02;
    }
}
