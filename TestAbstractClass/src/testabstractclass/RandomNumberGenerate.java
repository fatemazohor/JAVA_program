/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testabstractclass;

/**
 *
 * @author joty_
 */
public abstract class RandomNumberGenerate {
    private String color = "";

    public RandomNumberGenerate() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public abstract int generateRandomNumber();
    
    
    
    
}
