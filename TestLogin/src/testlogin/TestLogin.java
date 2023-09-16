package testlogin;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        
        
        
        
//        DataCon dataCon = new DataCon();
//        String sql = "insert into persons(name,email,dob,address,gender,subject,hobby) values(?,?,?,?,?,?,?)";
//        
//        try {
//            PreparedStatement ps =dataCon.getCon().prepareCall(sql);
//            ps.setString(1, "Fahim");
//            ps.setString(2, "Fahim@dfkd");
//            ps.setString(3, null);
//            ps.setString(4, "Dhaka");
//            ps.setString(5, "Male");
//            ps.setString(6, "HTML");
//            ps.setString(7, "Reading Travaling");
//            
//            
//            
//            ps.executeUpdate();
//            dataCon.getCon().close();
//        } catch (SQLException ex) {
//            Logger.getLogger(TestLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
}
