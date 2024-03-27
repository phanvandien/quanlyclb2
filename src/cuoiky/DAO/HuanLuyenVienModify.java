
package cuoiky.DAO;


import cuoiky.Model.huanluyenvien;
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
public class HuanLuyenVienModify {
    public static List<huanluyenvien> findAll() {
        List<huanluyenvien> huanluyenvienList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        
        try{
// lay tat ca danh sach cau thu
        connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2","root","phandien05");
 //query
       String sql="select * from huanluyenvien";
       statement = connection.createStatement();
       
       ResultSet resultSet = statement.executeQuery(sql);
       
       while(resultSet.next()){
           huanluyenvien hlv = new huanluyenvien(resultSet.getInt("huanluyenvienid"),
                   resultSet.getString("name"),
                   resultSet.getInt("age"),
                   resultSet.getString("sex"),
                   resultSet.getDouble("price"),
                   resultSet.getDouble("bonus"),
                   resultSet.getString("formation"),
                   resultSet.getString("description"),
                   resultSet.getString("status"));
            huanluyenvienList.add(hlv);
           
       }
       
    }catch(SQLException ex){
        Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE,null,ex);
    }finally{
            if(statement != null){
                try{
                statement.close();
                }catch(SQLException ex){
        Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException ex){
        Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        
      }
        //ket thuc
        return huanluyenvienList;
   }
   public static void insert(huanluyenvien hlv) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
            //query
            String sql = "insert into huanluyenvien(huanluyenvienid,name,age,sex,price,bonus,formation,description,status) values(?,?,?,?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
             statement.setInt(1, hlv.getId());
            statement.setString(2, hlv.getName());
            statement.setInt(3, hlv.getAge());
            statement.setString(4, hlv.getSex());
            statement.setDouble(5, hlv.getPrice());
            
            statement.setDouble(6, hlv.getBonus());
            statement.setString(7, hlv.getFormation());
            statement.setString(8, hlv.getDescription());
            statement.setString(9, hlv.getStatus());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
 public static void update(huanluyenvien hlv) {
       Connection connection = null;
        PreparedStatement statement = null;
       
       try {
          //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
           //query
           String sql = "update huanluyenvien set name=? ,age=?,sex=?,price=?,bonus=?,formation=?,description=?,status=?  where huanluyenvienid = ?";
            statement = connection.prepareCall(sql);
            
           statement.setString(1, hlv.getName());
            statement.setInt(2, hlv.getAge());
            statement.setString(3, hlv.getSex());
            statement.setDouble(4, hlv.getPrice());
            
            statement.setDouble(5, hlv.getBonus());
            statement.setString(6, hlv.getFormation());
            statement.setString(7, hlv.getDescription());
            statement.setString(8, hlv.getStatus());
             statement.setInt(9, hlv.getId());
            
            
           statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
            if(statement != null) {
                try {
                    statement.close();
               } catch (SQLException ex) {
                    Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
               try {
                   connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
               }            }
      }
        //ket thuc.
    }
  public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
            //query
            String sql = "delete from huanluyenvien where huanluyenvienid = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HuanLuyenVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
 
  

}
