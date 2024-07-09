package Codes;


import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dtdbookstore", "root", "");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
                
        return conn;
    }
    
}
