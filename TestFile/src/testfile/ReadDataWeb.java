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

public class ReadDataWeb {

    public static void main(String[] args) throws FileNotFoundException {
        //create file object
//        File myFile = new File("C:\\Users\\user\\Desktop\\TenLineText.txt");
//        //check if file exist
//        myFile.exists();
        File mydoc = new File("C:\\Users\\user\\Desktop\\newdoc.docx");
        System.out.println(mydoc.exists());
        PrintWriter myd = new PrintWriter(mydoc);
        System.out.println(mydoc.exists());
        myd.print("hello");
        myd.close();
//        PrintWriter input = new PrintWriter(myFile);
//        //enter text in file
//        input.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
//       //close file 
//        input.close();
//           //check if file exist
//        System.out.println(myFile.exists());
//
//        Scanner output = new Scanner(myFile);
//        int count = 0;
//        String next = "";
//        int i = 1;
//        while (output.hasNext()) {
//            //read file and store 10 word in next Variable
//            next += output.next() + " ";
//
//            count++;
//            if (count == 10) {
//                //print 10 word
//                System.out.println(" line " + i + " " + next);
//                //restart count word
//                next = "";
//                count = 0;
//                //count line 
//                i++;
//            }
//
//        }
//        //close file
//        output.close();

    }

}
