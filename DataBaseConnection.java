import java.sql.*;
import javax.swing.*;

public class DataBaseConnection 
{

    public static Connection dbConn() 
    {
        try 
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
            return conn;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Connection Failed");
            e.printStackTrace();
            return null;
        }
    }
}