/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myvehicle;

/**
 *
 * @author user
 */
public class Bus extends Vehicle{
    
    int seat;

    public Bus() {
    }

    public Bus(int seat) {
        this.seat = seat;
    }

    public Bus(int seat, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public double getSalePrice() {
        
        double discount=0.10;
        double sum =0;
        if(seat > 40){
            sum= getRegularPrice()-getRegularPrice()*discount;
        }else{
            sum = getRegularPrice();
        }
        
        
        return sum; 
    }
    
    
    
    
    
}
