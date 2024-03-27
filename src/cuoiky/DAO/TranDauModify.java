
package cuoiky.DAO;

import cuoiky.Model.Trandau;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMIN
 */
public class TranDauModify {
    public static List<Trandau> findAll() {
        List<Trandau> TrandauList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        
        try{
// lay tat ca danh sach cau thu
        connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2","root","phandien05");
 //query
       String sql="select * from trandau";
       statement = connection.createStatement();
       
       ResultSet resultSet = statement.executeQuery(sql);
       
       while(resultSet.next()){
           Trandau td = new Trandau(resultSet.getInt("id"),
                   resultSet.getString("tengiai"),
                   resultSet.getString("theloai"),
                   resultSet.getString("tinhtrang"),
                   resultSet.getString("ngaythidau"),
                   resultSet.getString("ketqua"),
                   resultSet.getDouble("giave"),
                   resultSet.getInt("cauthuid"),
                   resultSet.getInt("huanluyenvienid"));
                   
            TrandauList.add(td);
           
       }
       
    }catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
    }finally{
            if(statement != null){
                try{
                statement.close();
                }catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        
      }
        //ket thuc
        return TrandauList;
   }
   public static void insert(Trandau td) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
            //query
            String sql = "insert into trandau(id,tengiai,theloai,tinhtrang,ngaythidau,ketqua,giave,cauthuid,huanluyenvienid) values(?,?,?,?,?,?,?, ?, ?)";
            statement = connection.prepareCall(sql);
             statement.setInt(1, td.getId());
             statement.setString(2, td.getTengiai());
             statement.setString(3,td.getTheloai());
             statement.setString(4,td.getTinhtrang());
             statement.setString(5,td.getNgaythidau());
             statement.setString(6,td.getKetqua());
             statement.setDouble(7, td.getGiave());
             statement.setInt(8,td.getCauthuid());
             statement.setInt(9, td.getHuanluyenvienid());
             
               
            statement.execute();
        } catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
    }finally{
            if(statement != null){
                try{
                statement.close();
                }catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        
      }
        
    }
 public static void update(Trandau td) {
       Connection connection = null;
        PreparedStatement statement = null;
       
       try {
          //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
           //query
           String sql = "update trandau set tengiai=?, theloai=?,tinhtrang=?,ngaythidau=?, ketqua=?, giave=?,cauthuid=?, huanluyenvienid=? where id=? ";
            statement = connection.prepareCall(sql);
            
           statement.setString(1, td.getTengiai());
             statement.setString(2,td.getTheloai());
             statement.setString(3,td.getTinhtrang());
             statement.setString(4,td.getNgaythidau());
             statement.setString(5, td.getKetqua());
             statement.setDouble(6, td.getGiave());
             statement.setInt(7,td.getCauthuid());
             statement.setInt(8, td.getHuanluyenvienid());
             statement.setInt(9, td.getId());
            
            
           statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
    }finally{
            if(statement != null){
                try{
                statement.close();
                }catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException ex){
        Logger.getLogger(TranDauModify.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        
    }
  
}
