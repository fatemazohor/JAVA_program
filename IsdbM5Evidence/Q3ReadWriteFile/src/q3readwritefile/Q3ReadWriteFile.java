package q3readwritefile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Q3ReadWriteFile {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Employees[] myData = {
            new Employees("Abv", 30),
            new Employees("Tamim", 32),
            new Employees("Javed", 28),
            new Employees("Farhana", 31)
        };
    
        File myFile = new File("Employee.dat");
        FileOutputStream fos = new FileOutputStream(myFile);
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);
        //write data on Employee.dat file
        outputStream.writeObject(myData);
        
        //Read data 
        FileInputStream fis = new FileInputStream(myFile);
        ObjectInputStream inputStream = new ObjectInputStream(fis);
        
        Employees[] newArray = (Employees[])(inputStream.readObject());
    
        System.out.println(Arrays.toString(newArray));
    
    
    
    
    }
    
    
}
