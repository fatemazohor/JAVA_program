package teststudentsystemnew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class TestStudentSystemNew {


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
            //create Student class object in array
        Student[] students = {
            new Student("Rahat", 27),
            new Student("Jui", 32),
            new Student("Oman", 20),
            new Student("Akib", 26),
            
        };
        
        File file = new File("Student.dat");
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
        outputStream1.writeObject(file);
        
        
        
        
        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        System.out.println(ois.readObject());
        
//        Student[] newStu = (Student[])(ois.readObject());
//        
//        System.out.println(Arrays.toString(newStu));
        
        
        
        
        
        
        
    }
    
}
