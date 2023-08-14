package testbufferstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;

public class TestObjectStreamArray {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        int[] numbers = {2, 5, 6, 3};
//        String[] name = {"C", "D", "A"};
//        String[] lowerC = {"s","t","u"};
//        //create object of ObjectOutputStream
//        FileOutputStream dataEntry = new FileOutputStream("array.dat");
//        ObjectOutputStream input = new ObjectOutputStream(dataEntry);
//
//        //write array on array.dat file in binary
//        input.writeObject(numbers);
//        input.writeObject(name);
//
//        //create object of ObjectInputStream
//        FileInputStream dataRead = new FileInputStream("array.dat");
//        ObjectInputStream output = new ObjectInputStream(dataRead);
//        
//        //read binary code from array.dat, then push it into new Array variable.
//        int[] newNum = (int[]) (output.readObject());
//        String[] newName = (String[]) (output.readObject());
        
        //show new array in Output console
//        System.out.println("newNum " + Arrays.toString(newNum));
//        System.out.println("newName " + Arrays.toString(newName));
        
        
//       add number using randomAccessFile class
        RandomAccessFile reWrite = new RandomAccessFile("test.dat", "rw");
        
        System.out.println(reWrite.length());
        reWrite.seek(reWrite.length());
        reWrite.write(150);
        reWrite.seek((reWrite.length()));
        System.out.println(reWrite.readInt());

    }
}
