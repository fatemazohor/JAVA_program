package testbufferstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestBufferStream {

    public static void main(String[] args) throws IOException {

        File file = new File("test.dat");
        FileOutputStream output = null;
        try {
            //autoclosing 
            output = new FileOutputStream(file);
            for (int i = 0; i < 50; i++) {
                output.write(i);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestBufferStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        //output value pass in test.dat file

        try {
            FileInputStream fis = new FileInputStream("test.dat");
            for (int i = 0; i < 52; i++) {
            System.out.println(fis.read());    
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestBufferStream.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
