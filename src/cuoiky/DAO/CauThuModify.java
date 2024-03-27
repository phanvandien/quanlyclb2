
package cuoiky.DAO;

import cuoiky.Model.cauthu;


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
public class CauThuModify {
       public static List<cauthu> findAll() {
        List<cauthu> cauthuList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        
        try{
// lay tat ca danh sach cau thu
        connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2","root","phandien05");
 //query
       String sql="select * from cauthu";
       statement = connection.createStatement();
       
       ResultSet resultSet = statement.executeQuery(sql);
       
       while(resultSet.next()){
           cauthu ct = new cauthu(resultSet.getInt("cauthuid"),
                   resultSet.getString("name"),
                   resultSet.getInt("age"),
                   resultSet.getString("sex"),
                   resultSet.getDouble("price"),
                   resultSet.getDouble("bonus"),
                   resultSet.getString("position"),
                   resultSet.getString("national"),
                   resultSet.getDouble("weight"),
                   resultSet.getDouble("height"),
                    resultSet.getString("status"),
                   resultSet.getString("imagename"));
            cauthuList.add(ct);
           
       }
       
    }catch(SQLException ex){
        Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE,null,ex);
    }finally{
            if(statement != null){
                try{
                statement.close();
                }catch(SQLException ex){
        Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException ex){
        Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        
      }
        //ket thuc
        return cauthuList;
   }
   public static void insert(cauthu ct) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
            //query
            String sql = "insert into cauthu(cauthuid,name,age,sex,price,bonus,position,national,weight,height,status,imagename) values(?,?,?,?,?,?,?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
             statement.setInt(1, ct.getId());
               statement.setString(2, ct.getName());
            statement.setInt(3, ct.getAge());
            statement.setString(4, ct.getSex());
            statement.setDouble(5, ct.getPrice());
            
            statement.setDouble(6, ct.getBonus());
            statement.setString(7, ct.getPosition());
            statement.setString(8, ct.getNational());
            statement.setDouble(9, ct.getWeight());
            statement.setDouble(10, ct.getHeight());
            
            statement.setString(11, ct.getStatus());
            statement.setString(12, ct.getImagename());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
 public static void update(cauthu ct) {
       Connection connection = null;
        PreparedStatement statement = null;
       
       try {
          //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
           //query
           String sql = "update cauthu set name=? ,age=?,sex=?,price=?,bonus=?,position=?,national=?,weight=?,height=?,status=?,imagename=?  where cauthuid = ?";
            statement = connection.prepareCall(sql);
            
           statement.setString(1, ct.getName());
            statement.setInt(2, ct.getAge());
            statement.setString(3, ct.getSex());
            statement.setDouble(4, ct.getPrice());
            
            statement.setDouble(5, ct.getBonus());
            statement.setString(6, ct.getPosition());
            statement.setString(7, ct.getNational());
            statement.setDouble(8, ct.getWeight());
            statement.setDouble(9, ct.getHeight());
            
            statement.setString(10, ct.getStatus());
            statement.setString(11, ct.getImagename());
             statement.setInt(12, ct.getId());
            
            
           statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
  public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
           
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
            //query
            String sql = "delete from cauthu where cauthuid = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
 

}