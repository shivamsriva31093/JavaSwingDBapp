package databaseconnectivity;


import java.sql.*;
import javax.swing.JOptionPane;
public class DbCon {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private Connection con;   
    
    
    public  Connection getConnection(String db, String uname, String pwd) {
        
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection(URL+db, uname, pwd);
            return con;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Connectivity!");
        }
        return null;
    }
}
