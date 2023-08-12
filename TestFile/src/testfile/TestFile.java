/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TestFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a object for file when file may or may not exist yet
        File file = new File("C:\\Users\\user\\Desktop\\readText.txt");

        PrintWriter print = null;
        Scanner output = null;

        try {
            //printWriter class write on created file object and delete old text in the file or create 
            // file if it was not created yet then write.
            print = new PrintWriter(file);
            int num = 1;
            //rewrite same line 10 time
            while (num <= 10) {
                 print.println("Hello Java");
                 print.println("where are the next Line?");
                num++;
            }
           
            // close file after print 
            print.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        //check if file is created
        System.out.println(file.exists());
        System.out.println(file.isFile());
        try {
            //read file using Scanner
            output = new Scanner(file);
            while (output.hasNext()) {
                String next = output.nextLine();
                //show file text
                System.out.println("file data " + next);
                //close file
                
            }       
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
