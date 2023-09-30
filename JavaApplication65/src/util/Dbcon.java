/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dbcon {
    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/smemanagement";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getCon(){
    
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbcon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }
            
           
}
