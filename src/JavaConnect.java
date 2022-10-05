import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
public class JavaConnect {
    Connection conn;
    
    public static Connection ConnectDB(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms?zeroDateTimeBehavior=CONVERT_TO_NULL" , "root", "" );
    return conn;
   }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    
    }
    
}
