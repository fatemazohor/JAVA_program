package teststudentmange;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class TestStudentMange {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Student[] newStudent = new Student[2];
        newStudent[0] = new Student("Rahat",15);
        newStudent[1] = new Student("Fahad",35);
        
        
        //use ObjectOutputStream for object, primitive, string
        //FileOutputStream, PrintWriter  primitive, string
        FileOutputStream fileOutputStream = new FileOutputStream("StuInfo.dat");
        ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
        
        //send data to file
        output.writeObject(newStudent);
        
        FileInputStream fileInputStream = new FileInputStream("StuInfo.dat");
        ObjectInputStream input = new ObjectInputStream(fileInputStream);
        
//        System.out.println(input.readObject());
           Student[] printDATA = (Student[])(input.readObject());
        
           System.out.println(Arrays.toString(printDATA));
        
        
    }
    
}
