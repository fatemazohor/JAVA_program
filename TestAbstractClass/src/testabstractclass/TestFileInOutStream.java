/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testabstractclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author user
 */
public class TestFileInOutStream {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("binary.dat");
        FileOutputStream output = new FileOutputStream(file);
        //output value pass in binary.dat file
        for (int i = 0; i < 10; i++) {
            output.write(i);
            
        }
        
        //create a input stream for the file
        FileInputStream input = new FileInputStream(file);
        //read values from the file
        int value;
        while((value = input.read()) != -1){
            System.out.println("value " + value+ " ");
        }
            
            
        
        
        
        
        
        
        
        
    }
    
}
