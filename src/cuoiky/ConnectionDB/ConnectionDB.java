
package cuoiky.ConnectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
     public static Connection getConnectionDB(){
        final String url ="jdbc:mysql://localhost:3306/dien";
        final String user = "root";
        final String password = "phandien05";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           return  DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        Connection conn = getConnectionDB();
        
        if(conn != null){
            System.out.println("thanh cong ");
        }
        else{
            System.out.println("that bai ");
        }
    }
}
