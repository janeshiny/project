import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","surya@2020");
                 return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
