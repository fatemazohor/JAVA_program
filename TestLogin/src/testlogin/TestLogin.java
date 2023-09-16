package testlogin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import utill.DataCon;
import view.From;

public class TestLogin {

    public static void main(String[] args) {
        // TODO code application logic here
        From from = new From();
        from.setLocationRelativeTo(null);
        from.setVisible(true);

        //read txt file 
//        String str = "F:\\netbeans\\TestLoginHome\\output.txt";
//
//        StringBuffer builder = new StringBuffer();
//
//        try {
//            BufferedReader buffer = new BufferedReader(new FileReader(str));
//
//            String file;
//
//            // Condition check via buffer.readLine() method
//            // holding true upto that the while loop runs
//            while ((file = buffer.readLine()) != null) {
//
//                builder.append(file).append("\n");
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(TestLogin.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TestLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println(builder.toString());

    }

}
