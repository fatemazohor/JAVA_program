package evd06jframecrude;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Dbcon;

public class Evd06JFrameCrude {

    public static void main(String[] args) {
        // TODO code application logic here
//        Dbcon d = new Dbcon();
//        String sql = "insert into data_collection(name) values(?)";
//        PreparedStatement ps;
//        try {
//            ps = d.getCon().prepareStatement(sql);
//            ps.setString(1, "Akib");
//            ps.executeUpdate();
//            ps.close();
//            d.getCon().close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Evd06JFrameCrude.class.getName()).log(Level.SEVERE, null, ex);
//        }

            List<String> sub = new ArrayList();
            sub.add("Java");
            sub.add("Mysql");
            
            System.out.println(sub.toString()); 
            String subject=String.join(",", sub);
            
            System.out.println(subject);
            

    }

}
