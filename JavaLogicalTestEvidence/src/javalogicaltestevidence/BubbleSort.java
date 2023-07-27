/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalogicaltestevidence;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BubbleSort {
    public static void main(String[] args) {
        // Create scanner to prompt input
        Scanner input = new Scanner(System.in);
        
        
         int myArray[] = {5,4,3,2,1};
            int n = myArray.length;
            
            System.out.println("lenglth " + n);
            
            System.out.println("Array before sort \n ");
            for(int i=0; i < n; i++){  
                        System.out.print(myArray[i] + " ");  
                } 
            
            
            for( int j = 1; j < n; j++){
            
                for(int i = 0; i < n-1;i++){
                
                    if(myArray[i] > myArray[i+1]){
                    
                        int temp = myArray[i];
                        myArray[i] = myArray[i+1];
                        myArray[i+1] = temp;
                    }
                }
            }
            
            System.out.println("\n Array After sort \n");
            for(int i=0; i < myArray.length; i++){  
                        System.out.printf(myArray[i] + " ");  
                }
        
        
        
        
        
        
        
        
    }
}
