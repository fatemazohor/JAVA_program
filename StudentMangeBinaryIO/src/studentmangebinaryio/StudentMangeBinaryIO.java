package studentmangebinaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import studentIO.Student;

public class StudentMangeBinaryIO {


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        
        Student[] students = {
        new Student("Ahmed", 20),
        new Student("Javed", 23),
        new Student("Lina", 26),
        new Student("Karim", 29),
        };
        // Create object without array(non-array object)
        Student addStudent = new Student("Check data", 0);
        Student addStudent2 = new Student("Add data", 0);
//        System.out.println(Arrays.toString(students));
        File file = new File("students.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //Write data on output file
        objectOutputStream.writeObject(students);
        
        //write data of non-array type object
        objectOutputStream.writeObject(addStudent);
        objectOutputStream.writeObject(addStudent2);
        
        //create object for fileinputstream class
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        
        
        Student[] readInfo = (Student[])(objectInputStream.readObject());
        System.out.println();
        for (int i = 0; i < readInfo.length-1; i++) {
            //read data from file.
            System.out.println(readInfo[i].toString());
        }
        
        //read non-array object data
        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
    }
    
}
