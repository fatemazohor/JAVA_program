package edible;

import interfacepak.TaxableInterface;

public class Fruits  implements TaxableInterface{
    private double unitPrice;
    private int unitOfProduct;

    public Fruits() {
    }

    public Fruits(double unitPrice, int unitOfProduct) {
        this.unitPrice = unitPrice;
        this.unitOfProduct = unitOfProduct;
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
    public double totalPrice(){
        return (unitOfProduct*unitPrice) ;
    }

    @Override
    public double priceAfterTax() {
        return (unitOfProduct*unitPrice)*1.02;
    }
    
    
}
