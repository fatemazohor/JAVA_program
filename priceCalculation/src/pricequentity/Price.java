/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricequentity;

/**
 *
 * @author user
 */
public class Price {
    
    private int quentity;
    private double unitPrice;

    public Price() {
    }

    public Price(int quentity, double unitPrice) {
        this.quentity = quentity;
        this.unitPrice = unitPrice;
    }

    public int getQuentity() {
        return quentity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
    public void calculateUnitPrice(){
           double total = unitPrice*quentity;
           
           System.out.println("Total = " + total);
    
    
    }
    
    
    public double calculateTotalPrice(){
           double total = unitPrice*quentity;
           
           return total;
    
    
    }
    
    
    
    
    
    
    
    
}
