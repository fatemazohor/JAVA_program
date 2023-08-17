package q3studentmanagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Q3StudentManagement {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Create object of the Student Class 
        Student[] student = {
            new Student("Tarque", 20),
            new Student("Jami", 23),
            new Student("Yamin", 14),
            new Student("Omi", 26)
        };

        //Create object for the File
        File file = new File("students.dat");
        //Create object of OutputStream
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        //Write students'data in the file.
        outputStream.writeObject(student);
        //Create object of InputStream
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        //Read students'data from file and send it to new Array of Student class to dispaly.
        Student[] newStudent = (Student[]) (inputStream.readObject());
        //show array value to String.
        System.out.println(Arrays.toString(newStudent));

    }

}
