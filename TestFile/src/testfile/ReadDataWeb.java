package testfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadDataWeb {

    public static void main(String[] args) throws FileNotFoundException {
        //create file object
        File myFile = new File("TenLineText.txt");
        //check if file exist
        System.out.println(myFile.exists());
        //create or connect with text file. file location will be src folder of filename.java (netbeans)
        PrintWriter input = new PrintWriter(myFile);
        //enter text in file
        input.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
        //close file , this will save file content.
        input.close();
        //check if file exist
        System.out.println(myFile.exists());
        //print first 10 word per line
        Scanner output = new Scanner(myFile);
        int count = 0;
        String next = "";
        int i = 1;
        while (output.hasNext()) {
            //read file and store 10 word in next Variable
            next += output.next() + " ";

            count++;
            if (count == 10) {
                //print 10 word
                System.out.println(" line " + i + " " + next);
                //restart count word
                next = "";
                count = 0;
                //count line 
                i++;
            }

        }
        //close file
        output.close();
        //comment code line 26-45 before running code line 49-75.
        //print first 10 word per line if match condition or targeted sourceText
//        int countN = 0;
//        String nextN = "";
//        String matchText = "";
//        String sourceText = "dolor";
//        int l = 1;
//        while (output.hasNext()) {
//            //read file and store 10 word in next Variable
//            matchText = output.next();
//
//            if (matchText.matches(sourceText)) {
//
//                for (int j = 0; j < 10; j++) {
//                    nextN += output.next() + " ";
//                    countN++;
//                }
//                System.out.println("line " + l + " " + nextN);
//                //restart count word
//                nextN = "";
//                countN = 0;
//                //count line 
//                l++;
//
//            }
//
//        }
//        //close file
//        output.close();

    }

}
