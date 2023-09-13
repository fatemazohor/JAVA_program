/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacon;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utill.DbCon;
import view.PersonalData;


public class DataCon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        DbCon dbCon = new DbCon();
//        String sql = "insert into Persons(id,lastname,firstname,age) Values(?,?,?,?)";
//        
//        try {
//            PreparedStatement ps = dbCon.getCon().prepareStatement(sql);
//            ps.setInt(1, 1);
//            ps.setString(2, "Alam");
//            ps.setString(3, "Noor");
//            ps.setInt(4, 21);
//            
//            ps.executeUpdate();
//            System.out.println("Ok");
//        } catch (SQLException ex) {
//            Logger.getLogger(DataCon.class.getName()).log(Level.SEVERE, null, ex);
//        }
        PersonalData pd = new PersonalData();
        
        pd.setLocationRelativeTo(null);
        pd.setVisible(true);
        ;
        
    }
    
}
