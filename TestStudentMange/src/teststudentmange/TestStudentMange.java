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
        
        Student[] newStudent = new Student[3];
        newStudent[0] = new Student("Rahat",15);
        newStudent[1] = new Student("Fahad",35);
        newStudent[1] = new Student("Tamimi",18);
        
       
        //code don't work
//       Student[] stuInfo = newStudent[1].writeFile("stuInfo1.dat", newStudent);
//        System.out.println(Arrays.toString(stuInfo));
//        System.out.println(Arrays.toString(newStudent[0].writeFile("stu2.dat", newStudent)));
               
        
        
        
        //use ObjectOutputStream for object, primitive, string
        //FileOutputStream, PrintWriter  primitive, string
        FileOutputStream fileOutputStream = new FileOutputStream("StuInfo1.dat");
        ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
        
        //send data to file
        output.writeObject(newStudent);
//        
        FileInputStream fileInputStream = new FileInputStream("StuInfo1.dat");
        ObjectInputStream input = new ObjectInputStream(fileInputStream);
        //this line give exception
//        System.out.println(input.readObject());
           Student[] printDATA = (Student[])(input.readObject());
        
           System.out.println(Arrays.toString(printDATA));
        
        
    }
    
}
